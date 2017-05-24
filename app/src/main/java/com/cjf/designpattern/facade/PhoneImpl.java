package com.cjf.designpattern.facade;

/**
 * Created by Administrator on 2017/4/12.
 */

public class PhoneImpl implements Phone {
    @Override
    public void dail() {
        System.out.println("打电话");
    }

    @Override
    public void hangup() {
        System.out.println("挂断");
    }
}
