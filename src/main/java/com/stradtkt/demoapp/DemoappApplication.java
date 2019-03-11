package com.stradtkt.demoapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication

@RestController
public class DemoappApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoappApplication.class, args);
    }

    @RequestMapping("/")
    public String hello() {
        return "Hello Client! How are you doing?";
    }

    @RequestMapping("/random")
    public String random() {
        return "Spring boot is great!  So easy to just respond with strings";
    }

}
