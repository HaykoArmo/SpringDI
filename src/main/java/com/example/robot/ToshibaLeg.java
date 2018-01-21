package com.example.robot;

import org.springframework.stereotype.Component;

@Component
public class ToshibaLeg implements Leg {
    @Override
    public void go() {
        System.out.println("Go to Toshiba!");
    }
}
