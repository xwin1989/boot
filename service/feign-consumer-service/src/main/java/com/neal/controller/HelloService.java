package com.neal.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Neal
 */
@FeignClient("test-service")
public interface HelloService {
    @RequestMapping("/hello")
    String hello();
}
