package com.example.fastcampus.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // ㅎㅐ당 클래스는 레스트 api처리하느느 controller
@RequestMapping("/api") // request mapping uri를 지정해주는 annotation
public class ApiController {
    @GetMapping("/hello")
    public String hello(){
        return "hello fast";
    }
}
