package com.neal.controller;

import com.neal.HelloWebService;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Neal
 */
@FeignClient("test-service")
public interface HelloService extends HelloWebService {
    @RequestMapping("/hello")
    String hello();
}
