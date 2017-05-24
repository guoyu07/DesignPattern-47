package com.cjf.designpattern.facade;

/**
 * Created by Administrator on 2017/4/12.
 */

public class Test {
    public static void main(String[] args) {
        MobilePhone nexus6=new MobilePhone();
        nexus6.takePicture();
        nexus6.videoChat();
    }
}
