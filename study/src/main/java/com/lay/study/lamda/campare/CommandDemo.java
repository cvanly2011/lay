package com.lay.study.lamda.campare;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * 命令式编程
 * Created by chenyalei on 2018/8/15.
 */
public class CommandDemo {

    public String cleanName(List<String> names){

        if(null == names || names.size() == 0){
            return "";
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < names.size(); i++) {
            if(null != names.get(i) && names.get(i).length() > 1){
                result.append(upperFistChar(names.get(i))).append(",");
            }
        }

        return result.substring(0,result.length() -1).toString();
    }

    public String upperFistChar(String s){
        return s.substring(0,1).toUpperCase() + s.substring(1,s.length());
     }

    public static void main(String[] args) {
        CommandDemo demo = new CommandDemo();
        String s = demo.cleanName(Lists.newArrayList("tom", "bob", "a", "b", "c", "jerry",null));
        System.out.println(s);
    }
}
