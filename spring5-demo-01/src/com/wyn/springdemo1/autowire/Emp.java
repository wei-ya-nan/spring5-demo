package com.wyn.springdemo1.autowire;

/**
 * @author wei-ya-nan
 * @version 1.0
 */
public class Emp<test> {
    private Dept dept;

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "dept=" + dept +
                '}';
    }
    public void test(){
        System.out.println(dept);
    }
}
