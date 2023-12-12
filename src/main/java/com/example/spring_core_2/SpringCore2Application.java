package com.example.spring_core_2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringCore2Application {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(MyConfig.class);
        Person person = applicationContext.getBean(Person.class);
        System.out.println(person);
        person.getLaptop().model();
    }
}