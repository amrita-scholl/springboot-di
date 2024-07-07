package com.example.springdi.services;

import org.springframework.stereotype.Component;


@Component
public class A {
    public void doSomething() {
        System.out.println("A is doing something.");
    }
}