package com.example.robot;

import org.springframework.stereotype.Component;

@Component
public class ToshibaHand implements Hand {
    @Override
    public void catchSomething() {
        System.out.println("Catched from Toshiba!");
    }
}
