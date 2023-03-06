package com.itheima;

import com.itheima.domain.Book;
import com.itheima.service.BookService;
import com.itheima.testcase.domain.BookCase;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author: Java_cmr
 * @Date: 2023/3/3 - 18:58
 */

@SpringBootTest
@Transactional
@Rollback(true)
public class DaoTest {
    @Autowired
    private BookService bookService;

    @Autowired
    private BookCase bookCase;

    @Test
    void testSave(){
        Book book = new Book();
        book.setName("aa1");
        book.setType("bb");
        book.setDescription("cc");

        bookService.save(book);
    }

    @Test
    void testRandom(){
        System.out.println(bookCase);
    }

}
