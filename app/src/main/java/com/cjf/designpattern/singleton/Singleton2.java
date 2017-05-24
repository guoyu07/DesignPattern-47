package com.designpattern.cjf.designpattern.singleton;

/**
 * Created by chenjifang on 2017/3/31.
 * 懒汉式单例模式
 */

public class Singleton2 {

    private static Singleton2 mSingleton=null;
    private Singleton2(){}

    public static synchronized Singleton2 getInstance(){
        if(mSingleton==null){
            mSingleton=new Singleton2();
        }
        return mSingleton;
    }


}
