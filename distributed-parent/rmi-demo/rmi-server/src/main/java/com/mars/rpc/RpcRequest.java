package com.mars.rpc;

import java.io.Serializable;

/**
 *  传输对象
 */
public class RpcRequest implements Serializable {


    private static final long serialVersionUID = -7968835743449140178L;
    private String className;
    private String methordName;
    private Object[] parameters;

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getMethordName() {
        return methordName;
    }

    public void setMethordName(String methordName) {
        this.methordName = methordName;
    }

    public Object[] getParameters() {
        return parameters;
    }

    public void setParameters(Object[] parameters) {
        this.parameters = parameters;
    }
}
