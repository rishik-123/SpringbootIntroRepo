package com.rishik.myFirstProjectSpringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyCar {
//    public String car(){
//    return "MycAR";}
    @Autowired
    private myDog dog;
    @GetMapping("car")
    public String car(){
        return dog.bark();
    }
}