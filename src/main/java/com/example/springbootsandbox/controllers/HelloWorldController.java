package com.example.springbootsandbox.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "hello")
public class HelloWorldController {

    @GetMapping("/world")
    public String helloWorld() {
        return "Hello world";
    }

    @GetMapping("/{name}")
    public String helloByName(@PathVariable String name) {
        return "Hello " + name;
    }
}
