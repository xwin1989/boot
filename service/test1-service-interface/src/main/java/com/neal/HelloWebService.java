package com.neal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Neal
 */
@RestController
public interface HelloWebService {
    @GetMapping("/hello4")
    String hello4(@RequestParam("name") String name, @RequestParam("value") String value);

    @GetMapping("/hello5")
    UserResponse hello5();
}
