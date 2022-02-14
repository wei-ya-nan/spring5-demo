package com.wyn.spring5.test;

import com.wyn.spring5.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author wei-ya-nan
 * @version 1.0
 */
public class demo01 {
    @Test
    public void testDem01() {
        //加载配置文件 ,组件扫描，寻找注解，创建对象
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.add();
    }
}
