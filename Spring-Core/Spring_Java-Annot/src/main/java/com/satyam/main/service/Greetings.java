package com.satyam.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service

public class Greetings {
    @Autowired
    private LocalDateTime time;

    public Greetings() {
        System.out.println("Greetings Loaded On Stack ");
    }

    public String generateGreeting(String name) {

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
