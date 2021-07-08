package com.chancetop.demo.config;

import org.springframework.boot.autoconfigure.AutoConfigurationImportEvent;
import org.springframework.boot.autoconfigure.AutoConfigurationImportListener;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.core.io.support.SpringFactoriesLoader;

import java.util.List;
import java.util.Set;

/**
 * @author Neal
 */
public class DefaultAutoConfigurationImportListener implements AutoConfigurationImportListener {
    @Override
    public void onAutoConfigurationImportEvent(AutoConfigurationImportEvent event) {
        ClassLoader classLoader = event.getClass().getClassLoader();

        List<String> factoryNames = SpringFactoriesLoader.loadFactoryNames(EnableAutoConfiguration.class, classLoader);
        List<String> configurations = event.getCandidateConfigurations();
        Set<String> exclusions = event.getExclusions();
        System.out.println("factoryNames");
        System.out.println(factoryNames);
        System.out.println("configurations");
        System.out.println(configurations);
        System.out.println("exclusions");
        System.out.println(exclusions);

    }
}
