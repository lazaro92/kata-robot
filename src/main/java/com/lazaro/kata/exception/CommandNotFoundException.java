package com.lazaro.kata.exception;

public class CommandNotFoundException extends RuntimeException {

    public CommandNotFoundException() {
        super("Entered command is not registered in the rover!");
    }
}
