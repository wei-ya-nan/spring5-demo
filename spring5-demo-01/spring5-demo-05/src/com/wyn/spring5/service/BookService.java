package com.wyn.spring5.service;

import com.wyn.spring5.dao.BookDao;
import com.wyn.spring5.entity.Crowd;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * @author wei-ya-nan
 * @version 1.0
 */
@Repository
public class BookService {
    @Autowired
    private BookDao bookDao;
    public void addCrowd(Crowd cro){
        bookDao.add(cro);
    }
}
