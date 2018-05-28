package com.lay.study.designmode.proxy;

/**
 * @author yalei.chen
 * @date 2018/2/13
 * @since JDK 1.8
 */
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello() {
//        System.out.println("Hello");
        return "Hello";
    }

    @Override
    public String sysBye() {
//        System.out.println("Bye");
        return "Bye";
    }
}
