package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.Laptop;

public class Hit {
    public static void main(String[] args) {
        ApplicationContext con = new ClassPathXmlApplicationContext("applicationconfig.xml");

//        For Setter Class
//        Mobile t =  con.getBean(Mobile.class);
//        boolean a = t.show();

//         For Constructor Class
        Laptop laptop = con.getBean(Laptop.class);
        boolean b = laptop.show();


        if (b) {
            System.out.println("Status True ");
        } else
            System.out.println("Status True ");


    }
}
