package com.satyam.main.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDateTime;

@Configuration
@ComponentScan(basePackages = "com.satyam")

public class JavaConfiguration {
    public JavaConfiguration() {
        System.out.println("JavaConfiguration Loaded On Stack ");
    }

    @Bean
    public LocalDateTime createTimeObject() {
        return LocalDateTime.now();
    }

}
