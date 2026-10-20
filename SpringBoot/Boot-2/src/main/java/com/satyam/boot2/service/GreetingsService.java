package com.satyam.boot2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalTime;

@Service
public class GreetingsService implements IGreetings {
    @Autowired
    private LocalTime time;

    @Override
    public String generateWish(String name) {

        int hour = time.getHour();
        System.out.println("Current :" + hour);
        if (hour < 12) {
            System.out.println("Good Morning : " + name);
        } else if (hour < 16) {
            System.out.println("Good Afternoon : " + name);

        } else if (hour < 20) {
            System.out.println("Good Afternoon : " + name);


        } else
            return "Good Night :";
        return name;
    }
}
