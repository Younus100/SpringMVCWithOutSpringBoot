package com.example.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/abc")
public class TestRestUrl {

    @GetMapping
    public String hello() {
        return "Hello, This is Spring MVC URL";
    }

    @GetMapping("/hello")
    public String helloPath() {
        return "Hello, This is Spring MVC URL with path";
    }
}
