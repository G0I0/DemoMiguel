package com.gmatias.demomiguel.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
    @GetMapping
    private String helloWorld() {
        return "Hello World";
    }
}
