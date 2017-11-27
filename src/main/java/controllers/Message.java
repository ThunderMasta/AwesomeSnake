package controllers;

import helpers.MessageHelper;

import java.io.Serializable;

public class Message implements Serializable {
    private String message = MessageHelper.getMessage();

    public String getMessage() {
        return message;
    }
}
