package com.lay.study.designmode.decorator;

/**
 * 饮料抽象类
 * @author yalei.chen
 * @date 2018/2/8
 * @since JDK 1.8
 */
public abstract class Beverage {

    String desc = "未知饮料";

    abstract double cost();

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
