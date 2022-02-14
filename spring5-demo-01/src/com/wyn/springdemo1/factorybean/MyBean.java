package com.wyn.springdemo1.factorybean;

import com.wyn.springdemo1.conllectiontype.Course;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author wei-ya-nan
 * @version 1.0
 */
public class MyBean implements FactoryBean<Course> {

    //定义返回bean的类型
    @Override
    public Course getObject() throws Exception {
        Course course = new Course();
        course.setCname("aaa");

        return course;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
