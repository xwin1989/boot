package com.chancetop.demo;

import org.springframework.context.event.ApplicationContextEvent;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * @author Neal
 */
@Component
public class MyEventListener {
//    @EventListener(ContextRefreshedEvent.class)
//    public void onContextRefreshed(ContextRefreshedEvent event) {
//        System.out.println("listener " + event.getClass().getSimpleName());
//    }

    @EventListener
    public void event(ApplicationContextEvent event) {
        System.out.println("listener2 " + event.getClass().getSimpleName());

    }
}
