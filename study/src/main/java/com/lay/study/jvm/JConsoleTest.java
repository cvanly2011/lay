package com.lay.study.jvm;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yalei.chen
 * @date 2018/2/28
 * @since JDK 1.8
 */
public class JConsoleTest {

    public static void fillHeap (int num ) throws InterruptedException{

        List<OOMObject> list=new ArrayList<OOMObject>();
        for (int i=0;i<num ;i++) {
            Thread.sleep(50);//稍作延迟，让曲线更加明显
            list.add(new OOMObject());
        }

        System.gc();
    }

    public static void main( String[]args) throws Exception{
        fillHeap (1000);
    }
}
