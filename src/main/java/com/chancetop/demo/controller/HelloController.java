package com.chancetop.demo.controller;

import com.chancetop.demo.exception.BookNotFoundException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Neal
 */
@RestController
public class HelloController {
    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @GetMapping("/book")
    public String book() {
        if (true) {
            throw new BookNotFoundException("book not found");
        }
        return "Greetings from Spring Boot!";
    }


}
