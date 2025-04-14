package com.example.demo.controller;

import org.springframework.stereotype.Controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Log4j2
@Controller
public class HomeController {

    // http://localhost:8080/
    @GetMapping("/")
    public String getHome() {
        log.info("home 요청 ");
        return "home"; // templates 폴더 밑에 home.html이 있어야한다.
    }

    // http://localhost:8080/basic
    @GetMapping("/basic")
    public String getMethodName() {
        return "info.html";
    }

}
