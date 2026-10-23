package com.example.java3tierdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "forward:/index.html";
    }

    @RestController
    public static class ApiController {

        @GetMapping("/api/health")
        public java.util.Map<String, String> health() {
            return java.util.Map.of("status", "UP");
        }
    }
}
