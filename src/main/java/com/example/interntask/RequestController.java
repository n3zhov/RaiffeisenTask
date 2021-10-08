package com.example.interntask;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/socks")
public class RequestController {
    @RequestMapping
    public String getSocks(){
        return "HTTP GET request was sent";
    }
    @PostMapping("/income")
    public String incomeSocks(){
        return "HTTP POST income request was sent";
    }
    @PostMapping("/outcome")
    public String outcomeSocks(){
        return "HTTP POST outcome request was sent";
    }
}
