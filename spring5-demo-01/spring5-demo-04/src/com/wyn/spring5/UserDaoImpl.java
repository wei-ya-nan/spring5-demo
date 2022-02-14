package com.wyn.spring5;

/**
 * @author wei-ya-nan
 * @version 1.0
 */
public class UserDaoImpl implements UserDao {
    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public String update(String id) {
        return id;
    }
}
