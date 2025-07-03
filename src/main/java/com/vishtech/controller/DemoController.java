package com.vishtech.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/hello")
    public String hello(){
        return "Hello from " + System.getenv("REGION");
    }

    @GetMapping("/health")
    public ResponseEntity<String> health(){
        return  ResponseEntity.ok("Healthy");
    }

    @GetMapping("/")
    public String welcome(){
        return  "App is running";
    }
}
