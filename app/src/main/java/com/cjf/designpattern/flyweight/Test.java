package com.cjf.designpattern.flyweight;

/**
 * Created by chenjifang on 2017/4/12.
 */

public class Test {
    public static void main(String[] args) {
        Ticket mTicket1 = TicketFactory.getTicket("北京", "青岛");
        mTicket1.showTicketInfo("上铺");

        Ticket mTicket2 = TicketFactory.getTicket("北京", "青岛");
        mTicket2.showTicketInfo("下铺");

        Ticket mTicket3 = TicketFactory.getTicket("北京", "青岛");
        mTicket3.showTicketInfo("坐票");
    }
}
