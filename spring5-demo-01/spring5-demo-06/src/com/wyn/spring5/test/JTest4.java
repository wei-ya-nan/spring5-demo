package com.wyn.spring5.test;

import com.wyn.spring5.service.UserService;

//import org.junit.Test;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author wei-ya-nan
 * @version 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)//选择单元测试的框架版本
//加载配置文件即ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
@ContextConfiguration("classpath:bean2.xml")
public class JTest4 {
    @Autowired
    private UserService userService;

    @Test
    public void test1(){
        userService.hh();
    }
}
