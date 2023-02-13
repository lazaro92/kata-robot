package com.lazaro.kata;


import com.lazaro.kata.model.Robot;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RobotTest {

    Robot robot;

    final int ORIGINAL_POSITION = 5;
    
    @Test
    void rotateRight_directionNorth_directionEast() {
        robot = new Robot(ORIGINAL_POSITION, ORIGINAL_POSITION, 'n');
        robot.rotateRight();
        assertEquals('e', robot.getDirection());
        assertEquals(ORIGINAL_POSITION, robot.getPositionX());
        assertEquals(ORIGINAL_POSITION, robot.getPositionY());
    }

    @Test
    void rotateRight_directionEast_directionSouth() {
        Robot robot = new Robot(ORIGINAL_POSITION, ORIGINAL_POSITION, 'e');
        robot.rotateRight();
        assertEquals('s', robot.getDirection());
        assertEquals(ORIGINAL_POSITION, robot.getPositionX());
        assertEquals(ORIGINAL_POSITION, robot.getPositionY());
    }

    @Test
    void rotateRight_directionSouth_directionWest() {
        Robot robot = new Robot(ORIGINAL_POSITION, ORIGINAL_POSITION, 's');
        robot.rotateRight();
        assertEquals('w', robot.getDirection());
        assertEquals(ORIGINAL_POSITION, robot.getPositionX());
        assertEquals(ORIGINAL_POSITION, robot.getPositionY());
    }

    @Test
    void rotateRight_directionWest_directionNorth() {
        Robot robot = new Robot(ORIGINAL_POSITION, ORIGINAL_POSITION, 'w');
        robot.rotateRight();
        assertEquals('n', robot.getDirection());
        assertEquals(ORIGINAL_POSITION, robot.getPositionX());
        assertEquals(ORIGINAL_POSITION, robot.getPositionY());
    }

    @Test
    void rotateLeft_directionNorth_directionWest() {
        Robot robot = new Robot(ORIGINAL_POSITION, ORIGINAL_POSITION, 'n');
        robot.rotateLeft();
        assertEquals('w', robot.getDirection());
        assertEquals(ORIGINAL_POSITION, robot.getPositionX());
        assertEquals(ORIGINAL_POSITION, robot.getPositionY());
    }

    @Test
    void rotateLeft_directionEast_directionNorth() {
        Robot robot = new Robot(ORIGINAL_POSITION, ORIGINAL_POSITION, 'e');
        robot.rotateLeft();
        assertEquals('n', robot.getDirection());
        assertEquals(ORIGINAL_POSITION, robot.getPositionX());
        assertEquals(ORIGINAL_POSITION, robot.getPositionY());
    }

    @Test
    void rotateLeft_directionSouth_directionEast() {
        Robot robot = new Robot(ORIGINAL_POSITION, ORIGINAL_POSITION, 's');
        robot.rotateLeft();
        assertEquals('e', robot.getDirection());
        assertEquals(ORIGINAL_POSITION, robot.getPositionX());
        assertEquals(ORIGINAL_POSITION, robot.getPositionY());
    }

    @Test
    void rotateLeft_directionWest_directionSouth() {
        Robot robot = new Robot(ORIGINAL_POSITION, ORIGINAL_POSITION, 'w');
        robot.rotateLeft();
        assertEquals('s', robot.getDirection());
        assertEquals(ORIGINAL_POSITION, robot.getPositionX());
        assertEquals(ORIGINAL_POSITION, robot.getPositionY());
    }

    @Test
    void advance_directionNorthX5Y5_directionNorthX5Y4() {
        Robot robot = new Robot(ORIGINAL_POSITION, ORIGINAL_POSITION, 'n');
        robot.advance();
        assertEquals('n', robot.getDirection());
        assertEquals(ORIGINAL_POSITION, robot.getPositionX());
        assertEquals(4, robot.getPositionY());
    }

    @Test
    void advance_directionEastX5Y5_directionEastX6Y5() {
        Robot robot = new Robot(ORIGINAL_POSITION, ORIGINAL_POSITION, 'e');
        robot.advance();
        assertEquals('e', robot.getDirection());
        assertEquals(6, robot.getPositionX());
        assertEquals(ORIGINAL_POSITION, robot.getPositionY());
    }

    @Test
    void advance_directionSouthX5Y5_directionSouthX6Y5() {
        Robot robot = new Robot(ORIGINAL_POSITION, ORIGINAL_POSITION, 's');
        robot.advance();
        assertEquals('s', robot.getDirection());
        assertEquals(ORIGINAL_POSITION, robot.getPositionX());
        assertEquals(6, robot.getPositionY());
    }

    @Test
    void advance_directionWestX5Y5_directionWestX4Y5() {
        Robot robot = new Robot(ORIGINAL_POSITION, ORIGINAL_POSITION, 'w');
        robot.advance();
        assertEquals('w', robot.getDirection());
        assertEquals(4, robot.getPositionX());
        assertEquals(ORIGINAL_POSITION, robot.getPositionY());
    }

    @Test
    void moveBack_directionNorthX5Y5_directionNorthX5Y6() {
        Robot robot = new Robot(ORIGINAL_POSITION, ORIGINAL_POSITION, 'n');
        robot.moveBack();
        assertEquals('n', robot.getDirection());
        assertEquals(ORIGINAL_POSITION, robot.getPositionX());
        assertEquals(6, robot.getPositionY());
    }

    @Test
    void moveBack_directionEastX5Y5_directionEastX4Y5() {
        Robot robot = new Robot(ORIGINAL_POSITION, ORIGINAL_POSITION, 'e');
        robot.moveBack();
        assertEquals('e', robot.getDirection());
        assertEquals(4, robot.getPositionX());
        assertEquals(ORIGINAL_POSITION, robot.getPositionY());
    }

    @Test
    void moveBack_directionSouthX5Y5_directionSouthX5Y4() {
        Robot robot = new Robot(ORIGINAL_POSITION, ORIGINAL_POSITION, 's');
        robot.moveBack();
        assertEquals('s', robot.getDirection());
        assertEquals(ORIGINAL_POSITION, robot.getPositionX());
        assertEquals(4, robot.getPositionY());
    }

    @Test
    void moveBack_directionWestX5Y5_directionWestX6Y5() {
        Robot robot = new Robot(ORIGINAL_POSITION, ORIGINAL_POSITION, 'w');
        robot.moveBack();
        assertEquals('w', robot.getDirection());
        assertEquals(6, robot.getPositionX());
        assertEquals(ORIGINAL_POSITION, robot.getPositionY());
    }
}
