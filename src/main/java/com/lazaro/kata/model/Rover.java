package com.lazaro.kata.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Rover {
    private int positionX;
    private int positionY;
    private Direction direction;

    private World world;

    public Rover(int positionX, int positionY, Direction direction, World world) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.direction = direction;
        this.world = world;
    }

    public void rotateLeft() {
        direction = direction.getLeft();
    }

    public void rotateRight() {
        direction = direction.getRight();
    }

    public void advance() {
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

    public void moveBack() {
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
}
