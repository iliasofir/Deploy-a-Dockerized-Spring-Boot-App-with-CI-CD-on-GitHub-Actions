package com.devops.pipeline_v1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {
    
    @GetMapping("/hello")
    public String hello() {
        return "Hello from DevOps Spring Boot Application!";
    }
    
    @GetMapping("/status")
    public String status() {
        return "Application is running successfully!";
    }
}