package com.akr.video.splitter.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeRestController {
    @GetMapping("/")
    public String welcome() {

        return "welcome Arun";
    }
}
