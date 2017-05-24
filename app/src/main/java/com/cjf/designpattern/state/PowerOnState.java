package com.cjf.designpattern.state;

/**
 * Created by chenjifang on 2017/4/7.
 */

public class PowerOnState implements ITvState {
    @Override
    public void nextChannel() {
        System.out.println("下一频道");
    }

    @Override
    public void prevChannel() {
        System.out.println("上一频道");
    }

    @Override
    public void turnUp() {
        System.out.println("音量增大");
    }

    @Override
    public void turnDown() {
        System.out.println("音量减小");
    }
}
