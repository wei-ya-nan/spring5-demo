package com.wyn.spring5.aopanno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @author wei-ya-nan
 * @version 1.0
 */
//AspectJ注解操作,
@Component
//@Service
public class User {//被增强的类

    public void add() {
        int i = 10 / 0;
        System.out.println("add...");
    }
}
