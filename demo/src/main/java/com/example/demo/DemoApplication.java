package com.example.demo;  // your package name

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoApplication {
	public static void main(String[] args) {
		// Load Spring context from AppConfig class
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfigue.class);

		// Get the Student bean from Spring container
		Student student = context.getBean(Student.class);


		// Use the bean (call method to print info)
		student.displayInfo();
	}
}
