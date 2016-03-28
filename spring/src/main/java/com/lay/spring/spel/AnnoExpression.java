package com.lay.spring.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Lay on 2016/3/26.
 */
public class AnnoExpression {

    public static void main(String args[]) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring/spel.xml");
        AnnoExpression helloBean1 = context.getBean("helloBean1", AnnoExpression.class);
        AnnoExpression helloBean2 = context.getBean("helloBean2", AnnoExpression.class);
        System.out.println("helloBean1 = [" + helloBean1.getValue() + "]");
        System.out.println("helloBean2 = [" + helloBean2.getValue() + "]");
    }


    @Value("#{'Hello'+world}")
    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
