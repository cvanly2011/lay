package com.lay.spring.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Lay on 2016/3/26.
 */
public class SpelClass {


    public static void main(String args[]) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring/spel.xml");
        SpelClass spelClass = context.getBean("spelClass", SpelClass.class);
        System.out.println(spelClass);
    }
    private float pi;
    private float randomNum;

    @Override
    public String toString() {
        return "SpelClass{" +
                "pi=" + pi +
                ", randomNum=" + randomNum +
                '}';
    }

    public float getPi() {
        return pi;
    }

    public void setPi(float pi) {
        this.pi = pi;
    }

    public float getRandomNum() {
        return randomNum;
    }

    public void setRandomNum(float randomNum) {
        this.randomNum = randomNum;
    }
}
