package com.fsit.didemo.controllers;

import com.fsit.didemo.services.GreetingServiceImpl;

/**
 * @author sean.bowen
 * @version 1.0
 * <p>
 * Creation date: 2019-07-15
 * @since 2019
 */
public class PropertyInjectedController {

    public GreetingServiceImpl greetingService;

    String sayHello() {
        return greetingService.sayGreeting();
    }
}
