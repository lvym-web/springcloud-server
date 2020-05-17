package com.lvym.provider;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProviderController {
    @Value("${server.port}")
    private String serverport;
    @GetMapping("/getPort")
    public String getPort(){

        return "端口："+serverport;
    }
}
