package com.rishik.myFirstProjectSpringboot;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class LoginAPI {
    @GetMapping("login")
    public String loginData(){
        return("Success");
    }
}