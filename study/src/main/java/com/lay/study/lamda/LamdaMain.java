package com.lay.study.lamda;

/**
 * @Author yalei.chen
 * @Date 2017/9/19
 * @Since JDK 1.8
 */
public class LamdaMain {

    public static void main(String[] argv) {
        engine((x,y)-> x + y);
        engine((x,y)-> x * y);
        engine((x,y)-> x / y);
        engine((x,y)-> x % y);
    }
    private static void engine(Calculator calculator){
        int x = 2, y = 4;
        int result = calculator.calculate(x,y);
        System.out.println(result);
    }
}

@FunctionalInterface
interface Calculator{
    int calculate(int x, int y);
}
