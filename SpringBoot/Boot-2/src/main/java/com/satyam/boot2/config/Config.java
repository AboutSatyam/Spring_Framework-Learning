package com.satyam.boot2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalTime;

@Configuration

public class Config {
    public Config() {
        System.out.println("Config Bean  Created ");
    }

    @Bean

    public LocalTime createTime() {


        return LocalTime.now();
    }
}
