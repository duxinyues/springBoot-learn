package com.example.dx;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DxController {
    @GetMapping("/hello")
    public String hello(){
        return "这是springboot页面";
    }
}
