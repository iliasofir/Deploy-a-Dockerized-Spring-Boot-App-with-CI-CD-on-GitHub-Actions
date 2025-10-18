package com.devops.pipeline_v1;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping()
public class HomeController {
    

    @RequestMapping("/")
    public String home() {
        return "Welcome to the DevOps Pipeline V1 Application!";
    }
}
