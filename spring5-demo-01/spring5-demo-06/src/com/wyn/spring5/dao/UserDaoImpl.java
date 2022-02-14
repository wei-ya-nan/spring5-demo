package com.wyn.spring5.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author wei-ya-nan
 * @version 1.0
 */
@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void add() {
        String sql = "update user set money=money+? where id = ?";
        jdbcTemplate.update(sql, 100, 2);
    }

    @Override
    public void reduce() {
        String sql = "update user set money=money-? where id = ?";
        jdbcTemplate.update(sql, 100, 1);
    }
}
