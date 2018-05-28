package com.lay.study.designmode.decorator;

/**
 * 浓缩咖啡饮料类
 * @author yalei.chen
 * @date 2018/2/8
 * @since JDK 1.8
 */
public class Espresso extends Beverage{

    public Espresso() {
        desc = "Espresso";
    }

    @Override
    double cost() {
        return 1.99;
    }
}
