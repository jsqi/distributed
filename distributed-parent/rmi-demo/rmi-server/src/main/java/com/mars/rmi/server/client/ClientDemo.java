package com.mars.rmi.server.client;

import com.mars.rmi.server.IHelloService;
import com.mars.rmi.server.IHelloServiceImpl;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class ClientDemo {

    public static void main(String[] args) throws RemoteException, NotBoundException, MalformedURLException {
        IHelloService iHelloService = (IHelloService) Naming.lookup("rmi://192.168.199.132/Hello");
        System.out.println(  iHelloService.sayHello("mars"));

    }
}
