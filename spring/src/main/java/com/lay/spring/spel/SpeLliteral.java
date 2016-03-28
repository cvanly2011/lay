package com.lay.spring.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Lay on 2016/3/26.
 */
public class SpeLliteral {

    public static void main(String args[]) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring/spel.xml");
        SpeLliteral speLliteral = context.getBean("spelLiteral", SpeLliteral.class);
        System.out.println(speLliteral);
    }

    private int count;
    private String message;
    private float frequency;
    private float capacity;
    private String name1;
    private String name2;
    private boolean enabled;

    @Override
    public String toString() {
        return "SpeLliteral{" +
                "count=" + count +
                ", message='" + message + '\'' +
                ", frequency=" + frequency +
                ", capacity=" + capacity +
                ", name1='" + name1 + '\'' +
                ", name2='" + name2 + '\'' +
                ", enabled=" + enabled +
                '}';
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public float getFrequency() {
        return frequency;
    }

    public void setFrequency(float frequency) {
        this.frequency = frequency;
    }

    public float getCapacity() {
        return capacity;
    }

    public void setCapacity(float capacity) {
        this.capacity = capacity;
    }

    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    public String getName2() {
        return name2;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
}
