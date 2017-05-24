package com.cjf.designpattern.state;

/**
 * Created by chenjifang on 2017/4/7.
 */

public class TvController implements PowerController {
    ITvState mITvState;

    @Override
    public void powerOn() {
        setITvState(new PowerOnState());
        System.out.println("电视开机");
    }

    @Override
    public void powerOff() {
        setITvState(new PowerOffState());
        System.out.println("电视关机");

    }

    public ITvState getITvState() {
        return mITvState;
    }

    public void setITvState(ITvState ITvState) {
        mITvState = ITvState;
    }

    public void nextChannel(){
        mITvState.nextChannel();
    }
    public void prevChannel(){
        mITvState.prevChannel();
    }
    public void turnUp(){
        mITvState.turnUp();
    }
    public void turnDown(){
        mITvState.turnDown();
    }
}
