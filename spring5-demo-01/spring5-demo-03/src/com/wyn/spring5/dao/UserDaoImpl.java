package com.wyn.spring5.dao;

import org.springframework.stereotype.Repository;

/**
 * @author wei-ya-nan
 * @version 1.0
 */
@Repository(value = "userDaoImpl")
public class UserDaoImpl implements UserDao {
    @Override
    public void add() {
        System.out.println("UserDaoImpl add.....");
    }
}
