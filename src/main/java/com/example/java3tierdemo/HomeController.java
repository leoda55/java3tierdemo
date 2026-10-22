
package com.example.java3tierdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "Java 3-Tier Demo - Application is running successfully on Azure!";
    }
}
