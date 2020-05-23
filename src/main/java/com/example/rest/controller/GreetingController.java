package com.example.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greeting")
public class GreetingController {

    @GetMapping("/genericGreeting")
    public String getGenericGreeting() {
        return "Hello";
    }

    @GetMapping("/getGreeting/{name}")
    public String getGreeting(@PathVariable(value = "name") String name) {
        return "Hello " + name;
    }
}
