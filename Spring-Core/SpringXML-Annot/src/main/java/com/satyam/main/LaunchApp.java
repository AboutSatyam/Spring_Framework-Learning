package com.satyam.main;

import com.satyam.main.service.Password;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LaunchApp {
    public static void main(String[] args) {

        ApplicationContext con = new ClassPathXmlApplicationContext("applicationconfig.xml");
        Password p = con.getBean(Password.class);
        p.passwordAlgoUsed();
    }

}
