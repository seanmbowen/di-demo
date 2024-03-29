package com.fsit.didemo.controllers;

import com.fsit.didemo.services.GreetingService;
import org.springframework.stereotype.Controller;

/**
 * @author sean.bowen
 * @version 1.0
 * <p>
 * Creation date: 2019-07-15
 * @since 2019
 */
@Controller
public class MyController {

    private GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String hello() {
        System.out.println(greetingService.sayGreeting());

        return "foo";
    }
}
