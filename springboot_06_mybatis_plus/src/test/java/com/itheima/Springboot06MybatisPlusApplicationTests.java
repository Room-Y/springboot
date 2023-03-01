package com.itheima;

import com.itheima.dao.BookDao;
import com.itheima.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot06MybatisPlusApplicationTests {

    @Autowired
    private BookDao bookDao;
    @Test
    void contextLoads() {
        Book book = bookDao.selectById(1);
        System.out.println(book);
    }

    @Test
    void selectAll(){
        System.out.println(bookDao.selectList(null));
    }

}
