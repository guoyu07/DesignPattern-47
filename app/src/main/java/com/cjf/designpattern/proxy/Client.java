package com.cjf.designpattern.proxy;

/**
 * Created by chenjifang on 2017/4/11.
 */

public class Client {
    public static void main(String[] args) {
        ILawsuit xiaomin=new XiaoMin();
        ILawsuit lawyer=new Lawyer(xiaomin);

        lawyer.submit();
        lawyer.burden();
        lawyer.defend();
        lawyer.finish();


    }
}
