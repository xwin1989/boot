package com.test.controller;

import com.neal.HelloWebService;
import com.neal.UserResponse;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Neal
 */
@RestController
public class Hello2Controller implements HelloWebService {
    @Override
    public String hello4(String name, String value) {
        return name + value;
    }

    @Override
    public UserResponse hello5() {
        UserResponse response = new UserResponse();
        response.setAge(1);
        response.setName("neal-hello5");
        return response;
    }
}
