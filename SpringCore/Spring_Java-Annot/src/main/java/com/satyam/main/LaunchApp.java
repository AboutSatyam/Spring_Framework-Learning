package com.satyam.main;

import com.satyam.main.config.JavaConfiguration;
import com.satyam.main.service.Greetings;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LaunchApp {
    public static void main(String[] args) {

//        ApplicationContext con = new ClassPathXmlApplicationContext(JavaConfiguration.class);
        ApplicationContext con = new AnnotationConfigApplicationContext(JavaConfiguration.class);
//        Password p = con.getBean(Password.class);
//        p.passwordAlgoUsed();


        Greetings greet = con.getBean(Greetings.class);


        System.out.println(greet.generateGreeting("Satyam"));

    }

}
