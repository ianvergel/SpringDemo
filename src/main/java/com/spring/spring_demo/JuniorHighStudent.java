package com.spring.spring_demo;

import org.springframework.stereotype.Component;

@Component
public class JuniorHighStudent implements Student {

    public JuniorHighStudent() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    @Override 
    public String getDailyAssignment() {
        return "Study spring Boot coding";
    }
}
