package com.wyn.springdemo.testdemo;

import com.wyn.springdemo.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author wei-ya-nan
 * @version 1.0
 */
public class TestBean {
    @Test
    public void testAdd(){
        //加载spring配置文件
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("prom.xml");
        //获取配置创建的对象
        UserService userService = applicationContext.getBean("userService", UserService.class);

        userService.add();

    }


}
