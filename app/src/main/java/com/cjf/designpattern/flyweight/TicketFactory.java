package com.cjf.designpattern.flyweight;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by chenjifang on 2017/4/12.
 */

public class TicketFactory {
    static Map<String, Ticket> stringTicketMap = new ConcurrentHashMap<String, Ticket>();

    public static Ticket getTicket(String from, String to) {
        String key = from + "-" + to;
        if (stringTicketMap.containsKey(key)) {
            System.out.println("使用缓存==>" + key);
            return stringTicketMap.get(key);
        } else {
            System.out.println("创建对象==>" + key);
            Ticket mTicket = new TrainTicket(from, to);
            stringTicketMap.put(key, mTicket);
            return mTicket;
        }
    }

}
