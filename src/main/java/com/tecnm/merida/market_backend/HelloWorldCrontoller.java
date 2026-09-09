package com.tecnm.merida.market_backend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/saludar")
public class HelloWorldCrontoller {
    @GetMapping("/saludo")
    public String helloWord() {
        return "Hello World!";
    }
}
