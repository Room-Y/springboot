package com.itheima.service;

import com.itheima.domain.Book;

import java.util.List;

/**
 * @author: Java_cmr
 * @Date: 2023/3/1 - 10:45
 */
public interface BookService {
    Boolean save(Book book);
    Boolean update(Book book);
    Boolean delete(Integer id);
    Book getById(Integer id);
    List<Book> getAll();


}
