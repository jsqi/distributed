package com.mars.rmi.server;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class Server {
    public static void main(String[] args) {
        try {
            IHelloService iHelloService = new IHelloServiceImpl();
            LocateRegistry.createRegistry(9999);
            // 发布服务
            Naming.rebind("rmi://192.168.199.132/Hello",iHelloService);
            System.out.println("服务启动成功");
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
