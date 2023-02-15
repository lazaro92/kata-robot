package com.lazaro.kata.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Rover {
    private int positionX;
    private int positionY;
    private char direction;

    private World world;

    public void rotateRight() {
        switch (direction) {
            case 'n' -> direction = 'e';
            case 'e' -> direction = 's';
            case 's' -> direction = 'w';
            case 'w' -> direction = 'n';
        }
    }

    public void rotateLeft() {
        switch (direction) {
            case 'n' -> direction = 'w';
            case 'e' -> direction = 'n';
            case 's' -> direction = 'e';
            case 'w' -> direction = 's';
        }
    }

    public void advance() {
        switch (direction) {
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
        switch (direction) {
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
