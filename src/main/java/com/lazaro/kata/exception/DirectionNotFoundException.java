package com.lazaro.kata.exception;

public class DirectionNotFoundException extends RuntimeException {

    public DirectionNotFoundException() {
        super("Entered direction is not correct!");
    }
}
