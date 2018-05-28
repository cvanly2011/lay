package com.lay.study.designmode.observer.own;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yalei.chen
 * @date 2018/2/8
 * @since JDK 1.8
 */
public class WeatherData implements Subject {


    private List<Observer> observers;

    private float temperature;

    public WeatherData() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);

    }

    @Override
    public void removeObserver(Observer observer) {

        int i = observers.indexOf(observer);
        if(i > 0 ){
            observers.remove(i);
        }

    }

    @Override
    public void notityObservers() {

        for (Observer observer : observers){
            observer.update(temperature);
        }

    }

    public void contentChange(){
        notityObservers();
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
        contentChange();
    }
}
