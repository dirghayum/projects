package com.dirghayumainali.restapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Combination of @controller and @ResponseBody annotations
public class HomeController {

    //Get HTTP Method
    // http://localhost:8080/hello-world

    @GetMapping("/hello-world")
    public String printWord(){
        return "Hello World!";
    }
}
