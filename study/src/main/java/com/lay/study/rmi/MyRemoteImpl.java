package com.lay.study.rmi;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.RMIClientSocketFactory;
import java.rmi.server.RMIServerSocketFactory;
import java.rmi.server.UnicastRemoteObject;

/**
 * @author yalei.chen
 * @date 2018/2/13
 * @since JDK 1.8
 */
public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {
    protected MyRemoteImpl() throws RemoteException {
    }

    protected MyRemoteImpl(int port) throws RemoteException {
        super(port);
    }

    protected MyRemoteImpl(int port, RMIClientSocketFactory csf, RMIServerSocketFactory ssf) throws RemoteException {
        super(port, csf, ssf);
    }

    @Override
    public String sayHello() throws RemoteException {
        return "Server says Hey";
    }


    public static void main(String[] args) {

        try {
            LocateRegistry.createRegistry(12312);
            MyRemote service = new MyRemoteImpl();
            Naming.bind("rmi://127.0.0.1:12312/RemoteHello",service);
            System.out.println("server start up");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
