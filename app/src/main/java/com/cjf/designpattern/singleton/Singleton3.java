package com.designpattern.cjf.designpattern.singleton;

/**
 * Created by chenjifang on 2017/3/31.
 * 静态内部类单例模式
 * 推荐使用
 */

public class Singleton3 {
    private Singleton3() {
    }

    public static Singleton3 getInstance() {
        return SingletonHolder.mInstance;
    }

    private static class SingletonHolder {
        private static final Singleton3 mInstance = new Singleton3();

    }
}
