package com.lay.study.designmode.observer.jdk;


import java.util.Observable;
import java.util.Observer;

/**
 * @author yalei.chen
 * @date 2018/2/8
 * @since JDK 1.8
 */
public class CurrentConditionsDisplay implements Observer,DisplayElement {

    private Observable observable;
    private float temp;

    public CurrentConditionsDisplay(Observable weatherDate) {
        this.observable = weatherDate;
        weatherDate.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("CurrentConditionsDisplay当前温度为："+temp);
    }

    @Override
    public void update(Observable o, Object arg) {

        if(o instanceof WeatherData){
            WeatherData weatherData = (WeatherData) o;
            this.temp = weatherData.getTemp();
            display();
        }

    }
}
