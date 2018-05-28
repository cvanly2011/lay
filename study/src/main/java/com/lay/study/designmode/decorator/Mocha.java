package com.lay.study.designmode.decorator;

/**
 * 一种配料
 * @author yalei.chen
 * @date 2018/2/8
 * @since JDK 1.8
 */
public class Mocha extends CondimentDecorator {

    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    double cost() {
        return 0.2 + beverage.cost();
    }

    @Override
    public String getDesc() {
        return beverage.getDesc()+",Mocha";
    }
}
