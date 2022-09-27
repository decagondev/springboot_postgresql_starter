package com.decadev.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

public class Hello {
    private long id;


    private String message;

    public Hello() {
    }

    public Hello(long id, String message) {
        this.id = id;
        this.message = message;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
