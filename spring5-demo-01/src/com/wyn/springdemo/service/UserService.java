package com.wyn.springdemo.service;

import com.wyn.springdemo.dao.UserDao;
import com.wyn.springdemo.dao.UserDaoImpl;

/**
 * @author wei-ya-nan
 * @version 1.0
 */
public class UserService {
    private UserDao userDao;

    //set方法注入属性
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

   public void add(){
        System.out.println("service.add.......");
        //原始创建对象 的方法。使用spring框架快速创建
//        UserDao userDao = new UserDaoImpl();
//        userDao.update();
    }


}
