package com.lay.study.designmode.decorator;

/**
 * 配料抽象类
 * @author yalei.chen
 * @date 2018/2/8
 * @since JDK 1.8
 */
public abstract  class CondimentDecorator extends Beverage {

    @Override
    public abstract String getDesc();
}
