package com.awesomesnake.core.controllers;

public class Greeting {
    private String message;

    Greeting(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
