package com.cjf.designpattern.singleton;

/**
 * Created by chenjifang on 2017/3/31.
 * DCL实现单例
 * 推荐使用
 */

public class DclSingleton {
    private static DclSingleton mDclSingleton = null;

    private DclSingleton() {
        //私有化构造方法
    }

    public static DclSingleton getInstance() {
        if (mDclSingleton == null) {
            synchronized (DclSingleton.class) {
                if (mDclSingleton == null) {
                    mDclSingleton = new DclSingleton();
                }
            }
        }
        return mDclSingleton;
    }

    public void doSomething(String str){
        System.out.println(str+"do somthing");
    }
}
