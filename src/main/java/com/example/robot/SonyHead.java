package com.example.robot;

public class SonyHead implements Head {
    @Override
    public void calc() {
        System.out.println("Thinking about Sony...");
    }
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
