package com.example.MyFirstProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Component
public class MyClass {
    @Autowired
    Laptop lap;
    public void code(){
        lap.compile();
    }

}
