package com.itheima.controller;

import com.itheima.domain.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: Java_cmr
 * @Date: 2023/3/3 - 15:27
 */

@RestController
@RequestMapping("/books")
public class BookController {

    @GetMapping
    public Book getById(){
        System.out.println("getById is running……");

        Book book = new Book();
        book.setId(1);
        book.setName("aa");
        book.setType("bb");
        book.setDescription("cc");

        return book;
    }
}
