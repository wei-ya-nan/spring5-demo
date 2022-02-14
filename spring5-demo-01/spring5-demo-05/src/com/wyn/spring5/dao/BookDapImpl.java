package com.wyn.spring5.dao;

import com.wyn.spring5.entity.Crowd;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Repository;

/**
 * @author wei-ya-nan
 * @version 1.0
 */
@Repository
public class BookDapImpl implements BookDao {
    //注入dao
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void add(@Nullable Crowd cro) {
        String sql = "select * from crowd";
        jdbcTemplate.update(sql);
    }
}
