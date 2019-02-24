package com.mars.rmi.server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class IHelloServiceImpl extends UnicastRemoteObject implements IHelloService{

    protected IHelloServiceImpl() throws RemoteException {
        super();
    }

    @Override
    public String sayHello(String msg) throws RemoteException{
        return "Hello,"+msg;
    }
}
