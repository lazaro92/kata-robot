package com.lazaro.kata.model;

import com.lazaro.kata.exception.CommandNotFoundException;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Rover {
    private int positionX;
    private int positionY;

    private Direction direction;
    private World world;

    public Rover(int positionX, int positionY, Direction direction) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.direction = direction;
    }

    public void executeCommand(String command) throws CommandNotFoundException {
        switch (command) {
            case "f" -> advance();
            case "b" -> moveBack();
            case "l" -> rotateLeft();
            case "r" -> rotateRight();
            default -> throw new CommandNotFoundException();
        }
    }

    private void rotateLeft() {
        direction = direction.getLeft();
    }

    private void rotateRight() {
        direction = direction.getRight();
    }

    private void advance() {
        switch (direction.getValue()) {
            case 'n' -> {
                if (positionY == 0) positionY = world.getSizeY() - 1;
                else positionY--;
            }
            case 'e' -> {
                if (positionX == world.getSizeX() - 1) positionX = 0;
                else positionX++;
            }
            case 's' -> {
                if (positionY == world.getSizeY() - 1) positionY = 0;
                else positionY++;
            }
            case 'w' -> {
                if (positionX == 0) positionX = world.getSizeX() - 1;
                else positionX--;
            }
        }
    }

    private void moveBack() {
        switch (direction.getValue()) {
            case 'n' -> {
                if (positionY == world.getSizeY() - 1) positionY = 0;
                else positionY++;
            }
            case 'e' -> {
                if (positionX == 0) positionX = world.getSizeX() - 1;
                else positionX--;
            }
            case 's' -> {
                if (positionY == 0) positionY = world.getSizeY() - 1;
                else positionY--;
            }
            case 'w' -> {
                if (positionX == world.getSizeX() - 1) positionX = 0;
                else positionX++;
            }
        }
    }

    public String printData() {
        return world.generateMap(positionX, positionY, direction);
    }
}
