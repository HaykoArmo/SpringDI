package com.example.robot;

import org.springframework.stereotype.Component;

@Component
public class ToshibaHead implements Head{

    @Override
    public void calc() {
        System.out.println("Thinking about Toshiba...");
    }
}
