package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.example.demo")
public class AppConfigue {
    @Bean
    public Address address(){

        return new Address(122,"kathmmandu",11);
    }
    @Bean
        public Student student(){
        return new  Student ("suresh",18,address());
    }
}
