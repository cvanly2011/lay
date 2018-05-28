package com.lay.study.designmode.decorator;

/**
 * 一种配料
 * @author yalei.chen
 * @date 2018/2/8
 * @since JDK 1.8
 */
public class Soy extends CondimentDecorator {

    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    double cost() {
        return 0.3 + beverage.cost();
    }

    @Override
    public String getDesc() {
        return beverage.getDesc()+",Soy";
    }
}
