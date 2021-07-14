package com.neal;

import com.neal.client.ProviderClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Neal
 */
@RestController
public class ConsumerController {
    @Autowired
    ProviderClient providerClient;

    @GetMapping("/hi-feign")
    public String hiFeign(){
        return providerClient.hi("feign2");
    }
}
