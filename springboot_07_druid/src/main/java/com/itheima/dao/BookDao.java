package com.itheima.dao;

import com.itheima.domain.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @author: Java_cmr
 * @Date: 2023/2/28 - 20:05
 */

@Mapper
public interface BookDao{
    @Select("select * from mybatis.book where id=#{id}")
    public Book getById(Integer id);
}
