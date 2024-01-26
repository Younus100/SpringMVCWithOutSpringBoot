package com.example.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/abc")
public class TestRestUrl {

    @GetMapping  // This maps to http://localhost:8085/abc
    public String hewllo() {
        return "Hello, This is Spring MVC URLppppppppppp";
    }

    @GetMapping("hello")  // This maps to http://localhost:8085/abc/hello
    public String hello() {
        return "Hello, This is Spring MVC URLlllllllllll";
    }
}
