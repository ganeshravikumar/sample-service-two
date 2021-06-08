package com.gr.ms.demo.controller;


import com.gr.ms.demo.dto.Greetingtwo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/greetingtwo")
    public Greetingtwo greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Greetingtwo(counter.incrementAndGet(), String.format(template, name));
    }
}
