package com.satyam.boot3.services;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class Alien {

    static {
        System.out.println("Alien Static ");
    }

    {
        System.out.println("Alien Java Block");
    }

    public Alien() {
        System.out.println("Alien Constructor");
    }

    @PostConstruct
    public void init() {
        System.out.println("Init Method Alien");
    }

    public void disp(String Name) {
        System.out.println("Display Method " + Name);
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Bean Destroy");
    }
}
