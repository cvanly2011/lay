package com.lay.study.designmode.decorator;

/**
 * 咖啡店-主方法
 * @author yalei.chen
 * @date 2018/2/8
 * @since JDK 1.8
 */
public class StarbuzzCoffee {

    public static void main(String[] args) {

        //预订一杯Espresso，不加配料
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDesc() + "$" + beverage.cost());

        //预订一杯HouseBlend，添加多种配料
        Beverage beverage1 = new HouseBlend();
        beverage1 = new Mocha(beverage1);
        beverage1 = new Soy(beverage1);
        beverage1 = new Whip(beverage1);

        System.out.println(beverage1.getDesc() + "$" + beverage1.cost());
    }
}
