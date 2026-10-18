package com.satyam.main;

import com.satyam.main.service.Password;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class launchApp {
    public static void main(String[] args) {

        ApplicationContext con = new ClassPathXmlApplicationContext("applicationconfig.xml");
        //con.getApplicationName();
        Password p = con.getBean(Password.class);
        p.passwordAlgoUsed();

        // con.getBean(Password.class);
    }

}
