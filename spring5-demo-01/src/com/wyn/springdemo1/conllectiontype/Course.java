package com.wyn.springdemo1.conllectiontype;

/**
 * @author wei-ya-nan
 * @version 1.0
 */
public class Course {
    private String cname;

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    @Override
    public String toString() {
        return "Course{" +
                "cname='" + cname + '\'' +
                '}';
    }
}
