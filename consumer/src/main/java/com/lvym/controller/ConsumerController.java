package com.lvym.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/getPort")
    public String getPort(){
         String url="http://127.0.0.1:8000/getPort";
        String forObject = restTemplate.getForObject(url, String.class);
        System.out.println("端口："+forObject);
        return forObject;
    }
}
