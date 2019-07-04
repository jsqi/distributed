package com.mars.rpc;

public class ServerDemo {
    public static void main(String[] args) {
        IHelloService helloService = new IHelloServiceImpl();
        RpcServer rpcServer = new RpcServer();
        rpcServer.publisher(helloService,9999);
    }
}
