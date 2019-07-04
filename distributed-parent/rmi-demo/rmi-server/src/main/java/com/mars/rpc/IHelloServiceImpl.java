package com.mars.rpc;


public class IHelloServiceImpl implements IHelloService{

    @Override
    public String sayHello(String msg) {
        return "Hello,"+msg;
    }
}
