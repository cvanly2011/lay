package com.lay.study.rmi;

import java.rmi.Naming;

/**
 * @author yalei.chen
 * @date 2018/2/13
 * @since JDK 1.8
 */
public class MyRemoteClient {

    public static void main(String[] args) {
        new MyRemoteClient().go();
    }

    public void go(){
        try {

            MyRemote service = (MyRemote) Naming.lookup("rmi://127.0.0.1:12312/RemoteHello");
            String s = service.sayHello();
            System.out.println(s);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
