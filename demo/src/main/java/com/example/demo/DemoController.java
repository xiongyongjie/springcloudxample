package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("init")
public class DemoController {

    @RequestMapping("init")
    public String requestTest() {
        return "hello";
    }
}
