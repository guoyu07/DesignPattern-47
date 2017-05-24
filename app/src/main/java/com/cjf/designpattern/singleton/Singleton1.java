package com.designpattern.cjf.designpattern.singleton;

/**
 * Created by chenjifang on 2017/3/31.
 * 饿汉式单例模式
 */

public class Singleton1 {

    private static final Singleton1 mSingleton=new Singleton1();
    private Singleton1(){}

    public static Singleton1 getInstance(){
        return mSingleton;
    }


}
