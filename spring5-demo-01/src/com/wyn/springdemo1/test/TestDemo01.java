package com.wyn.springdemo1.test;

import com.wyn.springdemo1.conllectiontype.Stu;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author wei-ya-nan
 * @version 1.0
 */
public class TestDemo01 {
    @Test
    public void testCollection() {
        ApplicationContext context = new ClassPathXmlApplicationContext("conllection.xml");
        Stu stu = context.getBean("stu", Stu.class);
        stu.test();

    }

    public static void main(String[] args) {
        String cmd = args[0];

        cmd.matches("\\w");

    }
}
