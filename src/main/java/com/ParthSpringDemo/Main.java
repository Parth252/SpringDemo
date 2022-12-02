package com.ParthSpringDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Spring.xml");

        Doctor doctor = applicationContext.getBean(Doctor.class);
        System.out.println(doctor.name);
    }
}