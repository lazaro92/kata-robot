package com.lazaro.kata.exception;

public class OutOfBoundsException extends RuntimeException {

    public OutOfBoundsException() {
        super("Rover position is outside the bounds of the world!");
    }
}
