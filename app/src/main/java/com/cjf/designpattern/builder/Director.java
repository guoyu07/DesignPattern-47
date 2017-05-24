package com.cjf.designpattern.builder;

/**
 * Created by chenjifang on 2017/4/1.
 * 负责构造computer
 */

public class Director {
    Builder mBuilder=null;
    public Director(Builder builder){
        mBuilder=builder;
    }
    /**
     * 构建对象
     */
    public void construct(String board,String display){
        mBuilder.buildBoard(board);
        mBuilder.buildDisplay(display);
        mBuilder.buildOs();
    }
}
