package com.cjf.designpattern.facade;

/**
 * Created by Administrator on 2017/4/12.
 */

public class SamsungCamera implements Camera {
    @Override
    public void open() {
        System.out.println("打开相机");
    }

    @Override
    public void takePicture() {
        System.out.println("拍照");
    }

    @Override
    public void close() {
        System.out.println("关闭相机");
    }
}
