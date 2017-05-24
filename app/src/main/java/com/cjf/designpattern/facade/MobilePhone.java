package com.cjf.designpattern.facade;

/**
 * Created by Administrator on 2017/4/12.
 */

public class MobilePhone {
    private Phone mPhone=new PhoneImpl();
    private Camera camera=new SamsungCamera();

    public void dail(){
        mPhone.dail();
    }

    public void videoChat(){
        System.out.println("------>视频聊天接通中");
        camera.open();
        mPhone.dail();
    }

    public void hangup(){
        mPhone.hangup();
    }

    public void takePicture(){
        camera.open();
        camera.takePicture();
    }
    public void closeCamera(){
        camera.close();
    }
}
