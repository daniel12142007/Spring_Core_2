package com.example.spring_core_2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.example.spring_core_2")
@PropertySource("classpath:application.properties")
public class MyConfig {

    @Bean
    public Model model() {
        return new MacBook();
    }

    @Bean
    public Model models() {
        return new Acer();
    }
}