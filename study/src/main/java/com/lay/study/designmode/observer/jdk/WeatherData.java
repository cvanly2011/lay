package com.lay.study.designmode.observer.jdk;

import java.util.Observable;
import java.util.Observer;

/**
 * @author yalei.chen
 * @date 2018/2/8
 * @since JDK 1.8
 */
public class WeatherData extends Observable {

    private float temp;

    public float getTemp() {
        return temp;
    }

    public void setTemp(float temp) {
        this.temp = temp;
        contentChange();
    }

    public void contentChange(){
        setChanged();
        notifyObservers();
    }
}
