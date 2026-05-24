package com.rishik.myFirstProjectSpringboot;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Component
@RestController
public class MyCar {
    @GetMapping("car")
    public String car(){
    return "MycAR";}
}
