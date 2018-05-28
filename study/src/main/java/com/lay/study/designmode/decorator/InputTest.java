package com.lay.study.designmode.decorator;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * @author yalei.chen
 * @date 2018/2/8
 * @since JDK 1.8
 */
public class InputTest {

    public static void main(String[] args) {

        int c;
        try {


            BufferedInputStream bufferedInputStream = new BufferedInputStream(
                    Class.forName(InputTest.class.getName()).getResourceAsStream("/text.txt")
            );

            InputStream inputStream = new LowerCaseInputStream(
                    bufferedInputStream
            );

            while ((c = inputStream.read())  >= 0){

                System.out.println((char) c);
            }

            inputStream.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

