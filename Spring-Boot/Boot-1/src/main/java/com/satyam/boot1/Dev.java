package com.satyam.boot1;

import org.springframework.stereotype.Component;

@Component
public class Dev {
    public Dev() {
        System.out.println(" Dev Constructor Is Created");
    }

    public void build() {
        System.out.println("Build Is Created : ");

    }
}
