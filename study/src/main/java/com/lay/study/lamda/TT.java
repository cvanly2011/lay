package com.lay.study.lamda;

import java.util.Optional;

/**
 * Created by chenyalei on 2018/8/20.
 */
public class TT {

    public static void main(String[] args) {
        Optional<Integer> o = Optional.ofNullable(1);

        Integer integer = o.map(a -> a.intValue() + 10).orElse(1);

        System.out.println(integer);
    }
}
