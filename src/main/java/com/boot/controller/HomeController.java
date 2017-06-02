package com.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by naeem on 6/1/17.
 */
@RestController
public class HomeController {

    @RequestMapping("/")
    public String homeMessage(){
        return "welcome Home.";
    }
}
