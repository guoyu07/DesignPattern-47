package com.cjf.designpattern.cursor;

/**
 * Created by chenjifang on 2017/4/10.
 */

public class Boss {
    public static void main(String[] args) {
        CompanyMin min=new CompanyMin();
        check(min.iterator());
    }

    private static void check(Iterator iterator){
        while (iterator.hasNext()){
            System.out.println(iterator.next().toString());
        }
    }
}
