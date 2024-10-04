package com.example.dockerandspring;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataEndPoint {

    @GetMapping("/mydata")
    public String getUserByName(){

        return "Hello World";
    }
}
