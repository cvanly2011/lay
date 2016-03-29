package com.lay.itext;



import com.itextpdf.text.*;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.html.simpleparser.HTMLWorker;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfPageEventHelper;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.tool.xml.XMLWorkerHelper;

import java.awt.*;
import java.io.*;

import static java.lang.System.out;

/**
 * Created by Lay on 2016/3/29.
 */
public class HelloWorld {

    public static void main(String args[]){
        try {
//            printHelloWord();
//            addFileAttribute();
//            addHeaderFooter();
            html2Pdf();
        } catch (DocumentException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    private static void printHelloWord() throws DocumentException, FileNotFoundException {
        //Step 1—Create a Document.
        Document document = new Document();
        //Step 2—Get a PdfWriter instance.
        PdfWriter.getInstance(document, new FileOutputStream("HelloWorld.pdf"));
        //Step 3—Open the Document.
        document.open();
        //Step 4—Add content.
        document.add(new Paragraph("Hello World"));
        //Step 5—Close the Document.
        document.close();
    }

    private static void addFileAttribute() throws DocumentException, FileNotFoundException {
        //页面大小
        Rectangle rect = new Rectangle(PageSize.A4);
        //页面背景色
        rect.setBackgroundColor(BaseColor.WHITE);

        Document doc = new Document(rect);

        PdfWriter writer = PdfWriter.getInstance(doc, new FileOutputStream("addAttribute.pdf"));

        //PDF版本(默认1.4)
        writer.setPdfVersion(PdfWriter.VERSION_1_4);

        //设置密码为 World
//        writer.setEncryption("Hello".getBytes(), "World".getBytes(),
//                PdfWriter.AllowCopy,
//                PdfWriter.STRENGTH128BITS);

        //文档属性
        doc.addTitle("XReport");
        doc.addAuthor("NewLeaders");
        doc.addSubject("report");
        doc.addKeywords("nl1120");
        doc.addCreator("NewLeaders");

        //页边空白
        doc.setMargins(10, 20, 30, 40);

        doc.open();
        doc.add(new Paragraph("First Page"));
        doc.add(new Paragraph("TEXT TEXT"));

        //添加新页面
        doc.newPage();
        writer.setPageEmpty(false);

        doc.newPage();
        doc.add(new Paragraph("New page"));
        doc.close();
    }


    private static void addHeaderFooter() throws DocumentException, FileNotFoundException {
        Document doc = new Document();
        PdfWriter writer = PdfWriter.getInstance(doc, new FileOutputStream("setHeaderFooter.pdf"));

        writer.setPageEvent(new PdfPageEventHelper() {

            public void onEndPage(PdfWriter writer, Document document) {

                PdfContentByte cb = writer.getDirectContent();
                cb.saveState();

                cb.beginText();
                BaseFont bf = null;
                try {
                    bf = BaseFont.createFont(BaseFont.HELVETICA, BaseFont.WINANSI, BaseFont.EMBEDDED);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                cb.setFontAndSize(bf, 10);

                //Header
                float x = document.top(-20);

                //左
                cb.showTextAligned(PdfContentByte.ALIGN_LEFT,
                        "H-Left",
                        document.left(), x, 0);
                //中
                cb.showTextAligned(PdfContentByte.ALIGN_CENTER,
                        writer.getPageNumber()+ " page",
                        (document.right() + document.left())/2,
                        x, 0);
                //右
                cb.showTextAligned(PdfContentByte.ALIGN_RIGHT,
                        "H-Right",
                        document.right(), x, 0);

                //Footer
                float y = document.bottom(-20);

                //左
                cb.showTextAligned(PdfContentByte.ALIGN_LEFT,
                        "F-Left",
                        document.left(), y, 0);
                //中
                cb.showTextAligned(PdfContentByte.ALIGN_CENTER,
                        writer.getPageNumber()+" page",
                        (document.right() + document.left())/2,
                        y, 0);
                //右
                cb.showTextAligned(PdfContentByte.ALIGN_RIGHT,
                        "F-Right",
                        document.right(), y, 0);

                cb.endText();

                cb.restoreState();
            }
        });

        doc.open();
        doc.add(new Paragraph("1 page"));
        doc.newPage();
        doc.add(new Paragraph("2 page"));
        doc.newPage();
        doc.add(new Paragraph("3 page"));
        doc.newPage();
        doc.add(new Paragraph("4 page"));

        doc.close();
    }

    private static void html2Pdf() throws DocumentException, IOException {
        // step 1
        Document document = new Document();
        // step 2
        PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("pdf.pdf"));
        // step 3
        document.open();
        // step 4
        XMLWorkerHelper.getInstance().parseXHtml(writer, document,
                new FileInputStream("iText/index.html"));
        //step 5
        document.close();

        System.out.println( "PDF Created!" );
    }

}
