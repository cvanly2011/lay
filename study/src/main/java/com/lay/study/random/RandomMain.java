package com.lay.study.random;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Random;

/**
 * @author yalei.chen
 * @date 2018/1/14
 * @since JDK 1.8
 */
public class RandomMain {

    public static void main(String[] args) {

        for (int i=0;i<10;i++){
            createName();
        }

    }


    private static void createName(){

        int pageEnd = 678;

        Random random = new Random();
        int pageOne = random.nextInt(pageEnd);
        String one = "第一字页数于：" + pageOne + "页,";
        System.out.println(one);

        int pageTwo = random.nextInt(pageEnd);
//        while (pageTwo != pageOne){
//            System.out.println("==二页与首页相同，重新生成==");
//            pageTwo = random.nextInt(pageEnd);
//        }

        String two = "第二字页数于：" + pageTwo + "页;";
        System.out.println(two);

        try {
            File file = new File("/Users/lay/name/name.txt");
            List<String> list = FileUtils.readLines(file, "utf-8");
            list.add(one+two);
            FileUtils.writeLines(file,list);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
