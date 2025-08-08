package com.example.demo;

import com.example.student.Student1;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Demo1Application implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(Demo1Application.class, args);

    }
    @Override
    public void run(String... args) throws Exception {
        stdBeans1().displayInfo();
        stdBeans1().displayInfo();
    }

    public Student1 stdBeans1(){
        return new Student1("Suresh",12,111);
    }

    public Student1 stdBeans2(){
        return new Student1("Mohan",44,222);
    }

}
