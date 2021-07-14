package com.neal.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Neal
 */
@FeignClient(value = "provider-service")
public interface ProviderClient {
    @GetMapping("/hi")
    String hi(@RequestParam(value = "name", defaultValue = "neal", required = false) String name);
}
