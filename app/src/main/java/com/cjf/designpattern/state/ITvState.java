package com.cjf.designpattern.state;

/**
 * Created by chenjifang on 2017/4/7.
 */

public interface ITvState {
    void nextChannel();
    void prevChannel();
    void turnUp();
    void turnDown();
}
