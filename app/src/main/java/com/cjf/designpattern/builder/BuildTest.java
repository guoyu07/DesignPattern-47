package com.cjf.designpattern.builder;

/**
 * Created by chenjifang on 2017/4/1.
 */

public class BuildTest {
    public static void main(String[] args) {
        Builder mBuilder=new MacbookBuilder();
        Director mDirector=new Director(mBuilder);
        mDirector.construct("Intel主板","三星显示器");
        System.out.println("Computer Info : "+mBuilder.create().toString());

    }
}
