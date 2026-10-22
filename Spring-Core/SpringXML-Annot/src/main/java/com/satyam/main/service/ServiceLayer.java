package com.satyam.main.service;

import org.springframework.stereotype.Service;

@Service //-> Default Bean Id
//@Service("Layer") // --> My Own Bean Id

public class ServiceLayer {
    public ServiceLayer(){
        System.out.println("Service Layer is Created ");
    }
}
