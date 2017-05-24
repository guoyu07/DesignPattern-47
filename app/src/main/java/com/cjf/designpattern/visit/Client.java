package com.cjf.designpattern.visit;

/**
 * Created by chenjifang on 2017/4/11.
 */

public class Client {
    public static void main(String[] args) {
        BusinessReport report=new BusinessReport();
        System.out.println("========CEO==========");
        report.showReport(new CEOVisitor());
        System.out.println("========CTO==========");
        report.showReport(new CTOVisitor());
    }
}
