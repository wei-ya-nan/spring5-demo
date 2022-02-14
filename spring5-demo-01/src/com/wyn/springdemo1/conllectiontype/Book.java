package com.wyn.springdemo1.conllectiontype;

import java.util.List;

/**
 * @author wei-ya-nan
 * @version 1.0
 */
public class Book {
    private List<String> list;

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void test() {
        System.out.println(list);
    }
}
