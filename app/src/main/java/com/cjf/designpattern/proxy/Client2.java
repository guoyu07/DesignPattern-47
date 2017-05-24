package com.cjf.designpattern.proxy;

import java.lang.reflect.Proxy;

/**
 * Created by chenjifang on 2017/4/11.
 */

public class Client2 {
    public static void main(String[] args) {
        ILawsuit xiaomin = new XiaoMin();
        DynamicProxy mDynamicProxy = new DynamicProxy(xiaomin);

        ClassLoader mLoader=xiaomin.getClass().getClassLoader();

        ILawsuit lawyer= (ILawsuit) Proxy.newProxyInstance(mLoader,new Class[]{ILawsuit.class},mDynamicProxy);


        lawyer.submit();
        lawyer.burden();
        lawyer.defend();
        lawyer.finish();
    }
}
