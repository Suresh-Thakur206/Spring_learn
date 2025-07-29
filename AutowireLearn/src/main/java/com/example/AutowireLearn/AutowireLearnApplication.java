package com.example.AutowireLearn;

import in.sp.beans.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class AutowireLearnApplication {

	public static void main(String[] args) {
		SpringApplication.run(AutowireLearnApplication.class, args);
		ApplicationContext context=new AnnotationConfigApplicationContext(AppConfiug.class);

		Student std=context.getBean(Student.class);
		std.display();

	}

}
