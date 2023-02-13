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
            case 'n' -> positionY--;
            case 'e' -> positionX++;
            case 's' -> positionY++;
            case 'w' -> positionX--;
        }
    }

    public void moveBack() {
        switch (direction) {
            case 'n' -> positionY++;
            case 'e' -> positionX--;
            case 's' -> positionY--;
            case 'w' -> positionX++;
        }
    }
}
