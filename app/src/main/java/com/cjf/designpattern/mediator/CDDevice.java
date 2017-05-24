package com.cjf.designpattern.mediator;

/**
 * Created by chenjifang on 2017/4/11.
 */

public class CDDevice extends Colleague {
    private String data;

    public CDDevice(Mediator mediator) {
        super(mediator);
    }

    public String read() {
        return data;
    }

    public void load() {
        data = "视频数据,音频数据";
        mMediator.changed(this);
    }


}
