package com.mars.rpc;

import java.lang.reflect.Proxy;

public class RpcClientProxy {

    public <T> T clientProxy(final Class<T> interfaceClazz,final String host, final int port) {
        return  (T)  Proxy.newProxyInstance(interfaceClazz.getClassLoader(),new Class[] {interfaceClazz},new RemoteInvocationHandler());
    }
}
