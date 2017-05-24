package com.cjf.designpattern.visit;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by chenjifang on 2017/4/11.
 */

public class BusinessReport {
    List<Staff> mStaffs = new LinkedList<Staff>();

    public BusinessReport() {
        mStaffs.add(new Manager("王经理"));
        mStaffs.add(new Engineer("工程师1"));
        mStaffs.add(new Engineer("工程师2"));
        mStaffs.add(new Engineer("工程师3"));
        mStaffs.add(new Engineer("工程师4"));
    }

    public void showReport(Visitor visitor) {
        for (Staff mStaff : mStaffs) {
            mStaff.accept(visitor);
        }

    }
}
