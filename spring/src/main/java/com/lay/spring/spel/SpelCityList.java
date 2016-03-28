package com.lay.spring.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by Lay on 2016/3/26.
 */
public class SpelCityList {

    public static void main(String args[]) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring/spel.xml");
        SpelCityList spelCityList = context.getBean("cityList", SpelCityList.class);
        System.out.println(spelCityList);
    }

    @Override
    public String toString() {
        return "SpelCityList{" +
                "chosenCity1=" + chosenCity1 +
                ", chosenCity2=" + chosenCity2 +
                ", bigCitys=" + bigCitys +
                ", aBigCity1=" + aBigCity1 +
                ", aBigCity2=" + aBigCity2 +
                ", cityName1=" + cityName1 +
                ", cityName2=" + cityName2 +
                ", cityName3=" + cityName3 +
                '}';
    }

    private SpelCity chosenCity1;
    private SpelCity chosenCity2;
    private List bigCitys;
    private SpelCity aBigCity1;
    private SpelCity aBigCity2;
    private List cityName1;
    private List cityName2;
    private List cityName3;

    public SpelCity getChosenCity1() {
        return chosenCity1;
    }

    public void setChosenCity1(SpelCity chosenCity1) {
        this.chosenCity1 = chosenCity1;
    }

    public SpelCity getChosenCity2() {
        return chosenCity2;
    }

    public void setChosenCity2(SpelCity chosenCity2) {
        this.chosenCity2 = chosenCity2;
    }

    public List getBigCitys() {
        return bigCitys;
    }

    public void setBigCitys(List bigCitys) {
        this.bigCitys = bigCitys;
    }

    public SpelCity getaBigCity1() {
        return aBigCity1;
    }

    public void setaBigCity1(SpelCity aBigCity1) {
        this.aBigCity1 = aBigCity1;
    }

    public SpelCity getaBigCity2() {
        return aBigCity2;
    }

    public void setaBigCity2(SpelCity aBigCity2) {
        this.aBigCity2 = aBigCity2;
    }

    public List getCityName1() {
        return cityName1;
    }

    public void setCityName1(List cityName1) {
        this.cityName1 = cityName1;
    }

    public List getCityName2() {
        return cityName2;
    }

    public void setCityName2(List cityName2) {
        this.cityName2 = cityName2;
    }

    public List getCityName3() {
        return cityName3;
    }

    public void setCityName3(List cityName3) {
        this.cityName3 = cityName3;
    }
}
