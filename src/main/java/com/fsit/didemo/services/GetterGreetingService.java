package com.fsit.didemo.services;

import org.springframework.stereotype.Service;

/**
 * @author sean.bowen
 * @version 1.0
 * <p>
 * Creation date: 2019-07-15
 * @since 2019
 */
@Service
public class GetterGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello - I was injected via the getter";
    }
}
