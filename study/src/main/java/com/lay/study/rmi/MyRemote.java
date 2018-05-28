package com.lay.study.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * @author yalei.chen
 * @date 2018/2/13
 * @since JDK 1.8
 */
public interface MyRemote extends Remote {


    public String sayHello() throws RemoteException;
}
