package com.fsit.didemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * @author sean.bowen
 * @version 1.0
 * <p>
 * Creation date: 2019-07-15
 * @since 2019
 */
@Service
@Primary
@Profile("de")
public class PrimaryGermanGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hallo - Hauptgrußdienst";
    }
}
