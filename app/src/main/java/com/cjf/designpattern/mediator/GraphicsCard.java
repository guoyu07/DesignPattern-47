package com.cjf.designpattern.mediator;

/**
 * Created by chenjifang on 2017/4/11.
 */

public class GraphicsCard extends Colleague{
    public GraphicsCard(Mediator mediator) {
        super(mediator);
    }

    public void videoPlay(String data){
        System.out.println("视频 : "+data);
    }
}
