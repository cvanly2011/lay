package com.lay.study.designmode.decorator;

/**
 * 一种配料
 * @author yalei.chen
 * @date 2018/2/8
 * @since JDK 1.8
 */
public class Whip extends CondimentDecorator {

    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    double cost() {
        return 0.5 + beverage.cost();
    }

    @Override
    public String getDesc() {
        return beverage.getDesc()+",Whip";
    }
}
