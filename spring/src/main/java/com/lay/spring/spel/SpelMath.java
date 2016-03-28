package com.lay.spring.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Lay on 2016/3/26.
 */
public class SpelMath {

    public static void main(String args[]) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring/spel.xml");
        SpelMath spelMath = context.getBean("spelMath", SpelMath.class);
        System.out.println(spelMath);
    }

    private float adjustedAmount;
    private float circumFerence;
    private float average;
    private float remainder;
    private float area;
    private String fullName;

    @Override
    public String toString() {
        return "SpelMath{" +
                "adjustedAmount=" + adjustedAmount +
                ", circumFerence=" + circumFerence +
                ", average=" + average +
                ", remainder=" + remainder +
                ", area=" + area +
                ", fullName='" + fullName + '\'' +
                '}';
    }

    public float getAdjustedAmount() {
        return adjustedAmount;
    }

    public void setAdjustedAmount(float adjustedAmount) {
        this.adjustedAmount = adjustedAmount;
    }

    public float getCircumFerence() {
        return circumFerence;
    }

    public void setCircumFerence(float circumFerence) {
        this.circumFerence = circumFerence;
    }

    public float getAverage() {
        return average;
    }

    public void setAverage(float average) {
        this.average = average;
    }

    public float getRemainder() {
        return remainder;
    }

    public void setRemainder(float remainder) {
        this.remainder = remainder;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}
