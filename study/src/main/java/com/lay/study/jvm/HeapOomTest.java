package com.lay.study.jvm;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yalei.chen
 * @date 2018/2/26
 * @since JDK 1.8
 */
public class HeapOomTest {

    public static void main(String[] args) {
        List<OOMObject> list = new ArrayList<>();

        while (true) {
            list.add (new OOMObject());
        }
    }


}
