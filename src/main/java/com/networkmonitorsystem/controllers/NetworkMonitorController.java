package com.networkmonitorsystem.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("network")
public class NetworkMonitorController {

    @GetMapping("/hello")
    public String getHelloWord(){
        return "Hello Word";
    }
}
