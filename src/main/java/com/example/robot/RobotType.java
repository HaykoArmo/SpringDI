package com.example.robot;

import org.springframework.beans.factory.annotation.Qualifier;

import java.lang.annotation.*;


@Target({ ElementType.FIELD, ElementType.PARAMETER })
@Retention(RetentionPolicy.RUNTIME)
@Qualifier
public class RobotType {
    ColorStyle color();

    boolean sound();
}
