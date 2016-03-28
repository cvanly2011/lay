package com.lay.spring.spel;

import org.springframework.core.env.SystemEnvironmentPropertySource;
import org.springframework.expression.*;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

/**
 * Created by Lay on 2016/3/26.
 */
public class SpelTest {

    public static void main(String args[]){

        ExpressionParser parser = new SpelExpressionParser();
        Expression expression = parser.parseExpression("('Hello'+'World').concat(#end)");

        EvaluationContext context = new StandardEvaluationContext();
        context.setVariable("end","!");
        System.out.println(expression.getValue(context));
    }
}
