package com.lay.study.poi;

import java.util.List;
import java.util.Map;

/**
 * @author chenyalei
 * @version 1.0.0
 * @date 2018/10/16
 * @since 1.0.0
 */
public class TestMain {

    public static void main(String[] args) {

        ReadExcelUtils util = new ReadExcelUtils("/Users/chenyalei/Documents/data.xlsx");
        try {
            Map<Integer, Map<Integer, Object>> result = util.readExcelContent();

            System.out.println(result);

        } catch (Exception e) {

            e.printStackTrace();
        }
    }

//    public static List<String> getList() {
//
//    }

}
