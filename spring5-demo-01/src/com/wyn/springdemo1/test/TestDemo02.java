package com.wyn.springdemo1.test;


import com.wyn.springdemo1.autowire.Emp;
import com.wyn.springdemo1.conllectiontype.Book;
import com.wyn.springdemo1.conllectiontype.Course;
import com.wyn.springdemo1.conllectiontype.Stu;
import com.wyn.springdemo1.factorybean.MyBean;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author wei-ya-nan
 * @version 1.0
 */
public class TestDemo02 {
    @Test
    public void testCollection(){
        ApplicationContext context = new ClassPathXmlApplicationContext("conllection2.xml");
        Book book = context.getBean("book", Book.class);
        book.test();
    }
    @Test
    public void testBeanFactory(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        //普通bean类型返回的类型是相同，固定的
        //使用工厂bean的类型可以指定
        Course myBean = context.getBean("myBean", Course.class);
        System.out.println(myBean);
    }
    @Test
    public void testBean1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
        Emp emp = context.getBean("emp", Emp.class);
        System.out.println(emp.getDept());
    }
}
