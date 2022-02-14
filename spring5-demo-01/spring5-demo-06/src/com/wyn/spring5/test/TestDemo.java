package com.wyn.spring5.test;

import com.wyn.spring5.config.TxConfig;
import com.wyn.spring5.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

import java.util.ArrayList;

/**
 * @author wei-ya-nan
 * @version 1.0
 */
public class TestDemo {
    @Test
    public void testAccount() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean123.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.accountMoney();
    }

    @Test
    public void testAccountByXml() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.accountMoney();
    }

    @Test
    public void testAccountByTx() {
        ApplicationContext context = new AnnotationConfigApplicationContext(TxConfig.class);
        UserService userService = context.getBean("userService", UserService.class);
        userService.accountMoney();
        ArrayList list = new ArrayList();

    }

    //函数式风格创建对象，事项spring管理
    @Test
    public void testGenericApplicationContext() {
        //创建GenericApplicationContext对象
        GenericApplicationContext context = new GenericApplicationContext();
        //调用context的方法对象进行注册
        context.refresh();
        //注册过程
        context.registerBean("user", User.class, () -> new User());
        //获取在spring注册的对象
//        User user = (User) context.getBean("com.wyn.spring5.test.User");
        User user = (User) context.getBean("user");
        System.out.println(user);
    }
}
