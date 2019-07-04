package com.mars.rpc;

public class ClientDemo {

    public static void main(String[] args) {
        RpcClientProxy proxy = new RpcClientProxy();
        IHelloService helloService =  proxy.clientProxy(IHelloService.class,"localhost",9999);
        System.out.println(helloService.sayHello("mic"));
    }
}
