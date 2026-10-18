package com.satyam.main.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class Config {
    public Config() {
        System.out.println("Config Is Created  ");
    }

    @Bean
    public Password createPasswordBean()
    {

//  Normal Way
//        Password pass = new Password("SHA");
//        return pass;

//         Inline Way
        return new Password("SHA");
    }
}
