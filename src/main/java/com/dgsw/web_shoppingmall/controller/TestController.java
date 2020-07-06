package com.dgsw.web_shoppingmall.controller;

import java.util.HashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    
    @GetMapping("/api/hello")
    public HashMap hello() {
        HashMap result = new HashMap();
        result.put("message", "안녕하 세요");

        return result;
    }
}