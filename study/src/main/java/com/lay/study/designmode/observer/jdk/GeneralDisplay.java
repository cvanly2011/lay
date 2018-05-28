package com.lay.study.designmode.observer.jdk;

import java.util.Observable;
import java.util.Observer;

/**
 * @author yalei.chen
 * @date 2018/2/8
 * @since JDK 1.8
 */
public class GeneralDisplay implements Observer,DisplayElement {

    private Observable observable;

    private float temp;

    public GeneralDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {

        if(o instanceof WeatherData){
            WeatherData weatherData = (WeatherData) o;
            this.temp = weatherData.getTemp();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("GeneralDisplay当前温度为："+temp);
    }
}
