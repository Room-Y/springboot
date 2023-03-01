package com.itheima.dao;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.itheima.dao.BookDao;
import com.itheima.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot08SsmpApplicationTests {

    @Autowired
    private BookDao bookDao;

    @Test
    void contextLoads() {
    }

    @Test
    void testGetById(){
        System.out.println(bookDao.selectById(1));
    }

    @Test
    void testsave(){
        Book book = new Book();
        book.setType("测试数据123");
        book.setName("测试数据123");
        book.setDescription("测试数据123");
        System.out.println(bookDao.insert(book));
    }

    @Test
    void testPage(){
        IPage page = new Page(3,5);
        bookDao.selectPage(page, null);
    }

    @Test
    void testGetBy(){
        String name = "spring";
//        QueryWrapper<Book> qw = new QueryWrapper<>();
//        qw.like("name", "spring");
        LambdaQueryWrapper<Book> qw = new LambdaQueryWrapper();
        qw.like(name != null, Book::getName, name);

        System.out.println(bookDao.selectList(qw));
    }

}
