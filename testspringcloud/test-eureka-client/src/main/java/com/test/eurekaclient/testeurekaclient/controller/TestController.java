package com.test.eurekaclient.testeurekaclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Value("${server.port}")
    String port;

    @GetMapping(value = "/hi")
    public String index(@RequestParam String name){
        return "hi" + name + ",i am from port: " + port;
    }

}
