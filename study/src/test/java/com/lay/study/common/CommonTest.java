package com.lay.study.common;

import org.junit.Test;

/**
 * @author chenyalei
 * @version 1.0.0
 * @date 2018/10/19
 * @since 1.0.0
 */
public class CommonTest {

    @Test
    public void name() {

        long a = -1L;
        System.out.println(String.valueOf(a));
    }

    @Test
    public void name1() {
        String a = "1|2|3|4|6|7";
        String replace = a.replace("|", ",");
        System.out.println(a);
        System.out.println(replace);
    }

    @Test
    public void name2() {


        System.out.println("abcde".substring(1,3));

    }
}
