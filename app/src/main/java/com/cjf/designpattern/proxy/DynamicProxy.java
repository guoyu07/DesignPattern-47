package com.cjf.designpattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by chenjifang on 2017/4/11.
 */

public class DynamicProxy implements InvocationHandler {
    private Object mObject;

    public DynamicProxy(Object object) {
        this.mObject = object;
    }

    @Override
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
        Object result=method.invoke(mObject,objects);
        return result;
    }
}
