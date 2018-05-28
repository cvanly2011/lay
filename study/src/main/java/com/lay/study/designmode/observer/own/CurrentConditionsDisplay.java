package com.lay.study.designmode.observer.own;

/**
 * @author yalei.chen
 * @date 2018/2/8
 * @since JDK 1.8
 */
public class CurrentConditionsDisplay implements Observer,DisplayElement {

    private Subject weatherDate;
    private float temp;

    public CurrentConditionsDisplay(Subject weatherDate) {
        this.weatherDate = weatherDate;
        weatherDate.registerObserver(this);
    }

    @Override
    public void update(float temp) {

        this.temp = temp;
        display();

    }

    @Override
    public void display() {
        System.out.println("CurrentConditionsDisplay当前温度为："+temp);
    }
}
