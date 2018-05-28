package com.lay.study.designmode.decorator;

/**
 * HouseBlend饮料类
 * @author yalei.chen
 * @date 2018/2/8
 * @since JDK 1.8
 */
public class HouseBlend extends Beverage{

    public HouseBlend() {
        desc = "HouseBlend";
    }

    @Override
    double cost() {
        return 1.00;
    }
}
