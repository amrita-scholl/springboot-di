package com.example.springdi.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class C {
    private A a;
    private B b;

    // Constructor injection
    @Autowired
    public C(A a, B b) {
        this.a = a;
        this.b = b;
    }

    public void perform() {
        a.doSomething();
        b.doSomething();
        System.out.println("C is performing.");
    }
}
