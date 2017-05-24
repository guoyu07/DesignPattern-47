package com.cjf.designpattern.builder;

/**
 * Created by chenjifang on 2017/4/1.
 * 计算机抽象类 ,Product角色
 */

public abstract class Computer {
    protected String mBoard;
    protected String  mDisplay;
    protected String mOs;

    protected Computer(){

    }

    public void setBoard(String board) {
        mBoard = board;
    }

    public void setDisplay(String display) {
        mDisplay = display;
    }

    public abstract void setOs();

    @Override
    public String toString() {
        return "Computer [mBoard="+mBoard+",mDisplay="+mDisplay+",mOs="+mOs+"]";
    }
}
