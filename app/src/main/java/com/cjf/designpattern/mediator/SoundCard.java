package com.cjf.designpattern.mediator;

/**
 * Created by chenjifang on 2017/4/11.
 */
public class SoundCard extends Colleague {
    public SoundCard(Mediator mediator) {
        super(mediator);
    }
    public void soundPlay(String data){
        System.out.println("音频 : "+data);
    }
}
