package com.fsit.didemo.controllers;

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

    public String hello() {
        System.out.println("Hello");

        return "foo";
    }
}
