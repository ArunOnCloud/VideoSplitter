package com.akr.video.splitter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDateTime;

@Controller

public class HomeController {

    @RequestMapping("/home")

    public String welcome(Model model) {

        return "welcome";
    }
}
