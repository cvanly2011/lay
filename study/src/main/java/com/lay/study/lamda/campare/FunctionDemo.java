package com.lay.study.lamda.campare;

import com.google.common.collect.Lists;

import java.util.List;
import java.util.stream.Collectors;

/**
 * 函数式编程
 * Created by chenyalei on 2018/8/15.
 */
public class FunctionDemo {

    public String cleanName(List<String> names){

        if(null == names || names.size() == 0){
            return "";
        }

        return names
                .parallelStream()
                .filter(name -> null != name)
                .filter(name -> name.length() > 1)
                .map(name -> upperFistChar(name))
                .collect(Collectors.joining(","));

    }

    public String upperFistChar(String s){
        return s.substring(0,1).toUpperCase() + s.substring(1,s.length());
    }

    public static void main(String[] args) {
        FunctionDemo demo = new FunctionDemo();
        String s = demo.cleanName(Lists.newArrayList("tom", "bob", "a", "b", "c", "jerry",null));
        System.out.println(s);
    }
}
