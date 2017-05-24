package com.cjf.designpattern.mediator;

/**
 * Created by chenjifang on 2017/4/11.
 */
public class CPU extends Colleague {
    private String dataVideo, dataSound;


    public CPU(Mediator mediator) {
        super(mediator);
    }

    public String getDataVideo() {
        return dataVideo;
    }

    public String getDataSound() {
        return dataSound;
    }

    public void decodeData(String data) {
        String[] tmp = data.split(",");
        dataVideo = tmp[0];
        dataSound = tmp[1];
        mMediator.changed(this);
    }
}
