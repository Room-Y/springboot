package com.itheima.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.itheima.domain.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @author: Java_cmr
 * @Date: 2023/2/28 - 20:05
 */

@Mapper
public interface BookDao extends BaseMapper<Book> {

}
