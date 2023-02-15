package com.lazaro.kata.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Direction {

    NORTH('w', 'n', 'e'),
    EAST ('n', 'e', 's'),
    SOUTH('e', 's', 'w'),
    WEST ('s', 'w', 'n'),
    ;

    private final char left;
    private final char value;
    private final char right;

    public Direction getLeft() {
        return directionMatches(left);
    }

    public Direction getRight() {
        return directionMatches(right);
    }

    private Direction directionMatches(char value) {
        for (Direction direction : values()) {
            if (direction.value == value) {
                return direction;
            }
        }
        return null;
    }
}
