package com.lazaro.kata;


import com.lazaro.kata.model.Robot;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RobotTest {

    @Test
    void rotateRight_directionNorth_directionEast() {
        Robot robot = new Robot(0,0, 'n');
        robot.rotateRight();
        assertEquals('e', robot.getDirection());
    }

    @Test
    void rotateRight_directionEast_directionSouth() {
        Robot robot = new Robot(0, 0, 'e');
        robot.rotateRight();
        assertEquals('s', robot.getDirection());
    }

    @Test
    void rotateRight_directionSouth_directionWest() {
        Robot robot = new Robot(0, 0, 's');
        robot.rotateRight();
        assertEquals('w', robot.getDirection());
    }

    @Test
    void rotateRight_directionWest_directionNorth() {
        Robot robot = new Robot(0, 0, 'w');
        robot.rotateRight();
        assertEquals('n', robot.getDirection());
    }

    @Test
    void rotateLeft_directionNorth_directionWest() {
        Robot robot = new Robot(0, 0, 'n');
        robot.rotateLeft();
        assertEquals('w', robot.getDirection());
    }

    @Test
    void rotateLeft_directionEast_directionNorth() {
        Robot robot = new Robot(0, 0, 'e');
        robot.rotateLeft();
        assertEquals('n', robot.getDirection());
    }

    @Test
    void rotateLeft_directionSouth_directionEast() {
        Robot robot = new Robot(0, 0, 's');
        robot.rotateLeft();
        assertEquals('e', robot.getDirection());
    }

    @Test
    void rotateLeft_directionWest_directionSouth() {
        Robot robot = new Robot(0, 0, 'w');
        robot.rotateLeft();
        assertEquals('s', robot.getDirection());
    }
}
