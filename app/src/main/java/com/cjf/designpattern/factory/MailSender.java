package com.cjf.designpattern.factory;

/**
 * Created by chenjifang on 2017/5/25.
 */

public class MailSender implements Sender {
    @Override
    public void send() {
        System.out.println("a mail send by MailSender");
    }
}
