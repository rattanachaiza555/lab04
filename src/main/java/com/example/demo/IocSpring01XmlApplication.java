package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;
 
@SpringBootApplication
@ImportResource("classpath:Beans.xml")
public class IocSpring01XmlApplication
{
    public static void main (String[] args)
    {
        ConfigurableApplicationContext context = SpringApplication.run(IocSpring01XmlApplication.class, args);
        // do something
        System.out.println("Hello Spring boot");
        Device device = new Computer() ;
        System.out.println("Output of the code is the highly coupled style") ;
        System.out.println("Computer: "+device.display());
        //loosely coupled style via the ApplicationBeans.xml 
        System.out.println("Output of the code is the loosely coupled style");
        Device de = context.getBean("computer", Device.class);
        System.out.println("Computer: "+de.display());
        context.close();
    }
}