package com.lay.study.designmode.observer.jdk;


/**
 * 气象站-主方法
 * @author yalei.chen
 * @date 2018/2/8
 * @since JDK 1.8
 */
public class WeatherStation {

    public static void main(String[] args) {

        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        GeneralDisplay generalDisplay = new GeneralDisplay(weatherData);
        weatherData.setTemp(38);
    }
}
