package com.itheima.dao.impl;

import com.itheima.dao.BookDao;
import org.springframework.stereotype.Repository;
import org.springframework.util.backoff.BackOff;

/**
 * @author: Java_cmr
 * @Date: 2023/2/28 - 19:26
 */

@Repository
public class BookDaoImpl implements BookDao {
    @Override
    public void save() {
        System.out.println("bookdao is running……");
    }
}
