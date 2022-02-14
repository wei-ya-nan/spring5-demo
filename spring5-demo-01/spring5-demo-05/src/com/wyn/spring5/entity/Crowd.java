package com.wyn.spring5.entity;

import org.springframework.lang.Nullable;

/**
 * @author wei-ya-nan
 * @version 1.0
 */
public class Crowd {
    @Nullable
    private Integer id;
    private String name;
    private Integer age;
    private String sex;
    private String typeid;
    private String idnumber;

    @Override
    public String toString() {
        return "crowd{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", typeid='" + typeid + '\'' +
                ", idnumber='" + idnumber + '\'' +
                '}';
    }

    public Crowd(Integer id, String name, Integer age, String sex, String typeid, String idnumber) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.typeid = typeid;
        this.idnumber = idnumber;
    }

    public Crowd() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getTypeid() {
        return typeid;
    }

    public void setTypeid(String typeid) {
        this.typeid = typeid;
    }

    public String getIdnumber() {
        return idnumber;
    }

    public void setIdnumber(String idnumber) {
        this.idnumber = idnumber;
    }
}
