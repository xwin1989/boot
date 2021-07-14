package com.test.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Neal
 */
@RestController
public class HelloController {
    private final Logger logger = LoggerFactory.getLogger(HelloController.class);

    @Autowired
    private DiscoveryClient discoverClient;

    @GetMapping("/hello")
    public String index() {
        discoverClient.getServices().stream().flatMap(serviceId -> discoverClient.getInstances(serviceId).stream()).forEach(service -> {
            logger.info("host:{} serviceId:{}", service.getHost(), service.getServiceId());
        });
        return "hello";
    }

    @GetMapping("/user")
    public String getUser() {
        return "user";
    }

}
