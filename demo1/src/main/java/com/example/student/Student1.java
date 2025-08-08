package com.example.student;

public class Student1 {
    String name;
    int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getMarks() {
        return marks;
    }

    public void setMarks(float marks) {
        this.marks = marks;
    }

    float marks;

    public Student1(String name, int age, float marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;

    }
    public void displayInfo(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Marks: " + marks);
    }
}
