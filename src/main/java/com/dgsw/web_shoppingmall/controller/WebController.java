package com.dgsw.web_shoppingmall.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class WebController implements ErrorController {

    @GetMapping("/")
    public String index() {
        return "index.html";
    }

    @GetMapping("/error")
    public String error() {
        return "index.html";
    }

    @Override
    public String getErrorPath() {
        return "/error";
    }
    
}