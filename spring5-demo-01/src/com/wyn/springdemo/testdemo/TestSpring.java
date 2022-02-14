package com.wyn.springdemo.testdemo;

import com.wyn.springdemo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author wei-ya-nan
 * @version 1.0
 */
public class TestSpring {
    @Test
    public void testAdd() {
        //加载配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("prom.xml");
        //获取配置创建的对象
        User user = context.getBean("user", User.class);
        System.out.println(user);
        user.add();
    }
}
