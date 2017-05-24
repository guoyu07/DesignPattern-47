package com.cjf.designpattern.cursor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chenjifang on 2017/4/10.
 */

public class CompanyMin implements Company {

    private List<Employee> list=new ArrayList<>();

    public CompanyMin(){
        list.add(new Employee("xiaoming1",21));
        list.add(new Employee("xiaoming2",22));
        list.add(new Employee("xiaoming3",23));
        list.add(new Employee("xiaoming3",24));
    }

    public List<Employee> getList() {
        return list;
    }

    @Override
    public Iterator iterator() {
        return new MinIterator(list);
    }
}
