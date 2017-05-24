package com.cjf.designpattern.state;

/**
 * Created by chenjifang on 2017/4/7.
 */

public class Client {
    public static void main(String[] args) {
        TvController mTvController=new TvController();
        mTvController.powerOn();
        mTvController.nextChannel();
        mTvController.turnDown();
        mTvController.powerOff();
        mTvController.prevChannel();
    }
}
