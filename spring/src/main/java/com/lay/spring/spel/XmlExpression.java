package com.lay.spring.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Lay on 2016/3/26.
 */
public class XmlExpression {

    public static void main(String args[]){

        ApplicationContext context = new ClassPathXmlApplicationContext("spring/spel.xml");
        String hello1 = context.getBean("hello1", String.class);
        String hello2 = context.getBean("hello2", String.class);
        String hello3 = context.getBean("hello3", String.class);
        System.out.println("hello1 = [" + hello1 + "]");
        System.out.println("hello2 = [" + hello2 + "]");
        System.out.println("hello3 = [" + hello3 + "]");
    }
}
