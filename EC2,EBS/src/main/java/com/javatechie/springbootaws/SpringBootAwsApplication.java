package com.javatechie.springbootaws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootAwsApplication {

    @GetMapping("/status")
    public String home(){
        return "Hey this is my first cloud deployment";
    }
    public static void main(String[] args) {
        SpringApplication.run(SpringBootAwsApplication.class, args);
    }

}
