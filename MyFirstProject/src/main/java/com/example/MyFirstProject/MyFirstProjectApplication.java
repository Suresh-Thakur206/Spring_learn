package com.example.MyFirstProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MyFirstProjectApplication {

	public static void main(String[] args) {

		ApplicationContext context=SpringApplication.run(MyFirstProjectApplication.class, args);

		MyClass obj=context.getBean(MyClass.class);
		obj.code();
	}

}
