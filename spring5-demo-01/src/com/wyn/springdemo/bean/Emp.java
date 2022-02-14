package com.wyn.springdemo.bean;

/**
 * @author wei-ya-nan
 * @version 1.0
 * //
 */
@SuppressWarnings("All")
public class Emp {
    private String ename;
    private String gender;
    private Dept dept;

    public void setEname(String ename) {
        this.ename = ename;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }
}
