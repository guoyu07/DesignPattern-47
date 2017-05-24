package com.cjf.designpattern.builder;

/**
 * Created by chenjifang on 2017/4/1.
 * builder具体实现
 */

public class MacbookBuilder extends Builder {
    private Computer mComputer=new Macbook();
    @Override
    public void buildBoard(String board) {
        mComputer.setBoard(board);
    }

    @Override
    public void buildDisplay(String display) {
        mComputer.setDisplay(display);
    }

    @Override
    public void buildOs() {
        mComputer.setOs();
    }

    @Override
    public Computer create() {
        return mComputer;
    }
}
