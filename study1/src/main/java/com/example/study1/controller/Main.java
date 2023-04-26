package com.example.study1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Main {

    @GetMapping(value = "/")
    public String main(){
        return "Main";
    }
}
