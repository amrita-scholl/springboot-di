package com.example.springdi.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class D {
    private C c;

    // Constructor injection
    // @Autowired
    // public D(C c) {
    //     this.c = c;
    // }

    public void execute() {
        c.perform();
        System.out.println("D is executing.");
    }

    // Method injection
    @Autowired
    public void setC(C c) {
        this.c = c;
    }
}