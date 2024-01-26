package com.example.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/abc") // Add the prefix here
public class TestUrl2 {

    @RequestMapping("/test") // Include the full path here
    public String stringg() {
        return "Testtttt";
    }
}
