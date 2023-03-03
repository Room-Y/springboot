package com.itheima.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: Java_cmr
 * @Date: 2023/3/2 - 21:01
 */
@RestController
@RequestMapping("/books")
public class BookController {

    private static final Logger log = LoggerFactory.getLogger(BookController.class);

    @GetMapping
    public String getById(){
        log.error("error...");
        log.debug("debug...");
        log.info("info...");
        log.warn("warn...");
        log.trace("trace...");

        System.out.println("springboot is running");
        return "springboot is running....";
    }
}
