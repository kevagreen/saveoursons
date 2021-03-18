package com.tts.saveoursons.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping(value="/")
    public String index(){
        return "index";
    }

    @GetMapping(value = "/about")
    public String about(){
        return "about";
    }

    @GetMapping(value = "/donate")
    public String donate(){
        return "donate";
    }

    @GetMapping(value = "/help")
    public String contact(){
        return "help";
    }

}
