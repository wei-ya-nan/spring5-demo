package com.wyn.spring5.service;

import com.wyn.spring5.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author wei-ya-nan
 * @version 1.0
 */
@Service
@Transactional(propagation = Propagation.REQUIRED)//开启事务
public class UserService {
    //注入dao
    @Autowired
    private UserDao userDao;

    public void accountMoney() {
//        try {
        //开启事务

        //业务操作
        userDao.reduce();
        int a = 10 / 0;
        userDao.add();
        //事务的提交
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally{
//            //事务的回滚
//        }
    }

    public void hh() {
        System.out.println("hello");
    }


}
