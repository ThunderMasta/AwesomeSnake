package com.awesomesnake.core.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @RequestMapping("/greeting")
    public Greeting getGreeting() {
        return new Greeting("sdhfjsdkfds");
    }

}
