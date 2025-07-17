package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {
    private String name;
    private int rollNo;
    @Autowired
    private Address address;
    public String getName() {
        return name;
    }

   public Student(String name,int rollNo,Address address){
        this.name=name;
        this.rollNo=rollNo;
        this.address=address;

   }
   public void displayInfo(){
       System.out.println("Name is ; "+name);
       System.out.println("Rollno is : "+rollNo);
       System.out.println("Address is : "+address);
   }

}
