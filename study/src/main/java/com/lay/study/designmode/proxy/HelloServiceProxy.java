package com.lay.study.designmode.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author yalei.chen
 * @date 2018/2/13
 * @since JDK 1.8
 */
public class HelloServiceProxy implements InvocationHandler {

    private Object target;

    public HelloServiceProxy(Object target) {
        this.target = target;
    }

    /**
     * 绑定委托对象并返回一个【代理占位】
     * @param target 真实对象
     * @return  代理对象【占位】
     */
//    public  Object bind(Object target) {
//        this.target = target;
//        //取得代理对象
//        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
//                target.getClass().getInterfaces(), this);
//    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.err.println("############我是JDK动态代理################");
        Object result = null;
        //反射方法前调用
        System.err.println("我准备说话了。");
        //反射执行方法  相当于调用target.sayHelllo;
        result=method.invoke(target, args);
        System.out.println(result);//转成适当的类型
        //反射方法后调用.
        System.err.println("我说过了。");
        return result;
    }
}
