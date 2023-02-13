package com.lazaro.kata;


import com.lazaro.kata.model.Rover;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RoverTest {

    Rover rover;

    final int ORIGINAL_POSITION = 5;
    
    @Test
    void rotateRight_directionNorth_directionEast() {
        rover = new Rover(ORIGINAL_POSITION, ORIGINAL_POSITION, 'n');
        rover.rotateRight();
        assertEquals('e', rover.getDirection());
        assertEquals(ORIGINAL_POSITION, rover.getPositionX());
        assertEquals(ORIGINAL_POSITION, rover.getPositionY());
    }

    @Test
    void rotateRight_directionEast_directionSouth() {
        Rover rover = new Rover(ORIGINAL_POSITION, ORIGINAL_POSITION, 'e');
        rover.rotateRight();
        assertEquals('s', rover.getDirection());
        assertEquals(ORIGINAL_POSITION, rover.getPositionX());
        assertEquals(ORIGINAL_POSITION, rover.getPositionY());
    }

    @Test
    void rotateRight_directionSouth_directionWest() {
        Rover rover = new Rover(ORIGINAL_POSITION, ORIGINAL_POSITION, 's');
        rover.rotateRight();
        assertEquals('w', rover.getDirection());
        assertEquals(ORIGINAL_POSITION, rover.getPositionX());
        assertEquals(ORIGINAL_POSITION, rover.getPositionY());
    }

    @Test
    void rotateRight_directionWest_directionNorth() {
        Rover rover = new Rover(ORIGINAL_POSITION, ORIGINAL_POSITION, 'w');
        rover.rotateRight();
        assertEquals('n', rover.getDirection());
        assertEquals(ORIGINAL_POSITION, rover.getPositionX());
        assertEquals(ORIGINAL_POSITION, rover.getPositionY());
    }

    @Test
    void rotateLeft_directionNorth_directionWest() {
        Rover rover = new Rover(ORIGINAL_POSITION, ORIGINAL_POSITION, 'n');
        rover.rotateLeft();
        assertEquals('w', rover.getDirection());
        assertEquals(ORIGINAL_POSITION, rover.getPositionX());
        assertEquals(ORIGINAL_POSITION, rover.getPositionY());
    }

    @Test
    void rotateLeft_directionEast_directionNorth() {
        Rover rover = new Rover(ORIGINAL_POSITION, ORIGINAL_POSITION, 'e');
        rover.rotateLeft();
        assertEquals('n', rover.getDirection());
        assertEquals(ORIGINAL_POSITION, rover.getPositionX());
        assertEquals(ORIGINAL_POSITION, rover.getPositionY());
    }

    @Test
    void rotateLeft_directionSouth_directionEast() {
        Rover rover = new Rover(ORIGINAL_POSITION, ORIGINAL_POSITION, 's');
        rover.rotateLeft();
        assertEquals('e', rover.getDirection());
        assertEquals(ORIGINAL_POSITION, rover.getPositionX());
        assertEquals(ORIGINAL_POSITION, rover.getPositionY());
    }

    @Test
    void rotateLeft_directionWest_directionSouth() {
        Rover rover = new Rover(ORIGINAL_POSITION, ORIGINAL_POSITION, 'w');
        rover.rotateLeft();
        assertEquals('s', rover.getDirection());
        assertEquals(ORIGINAL_POSITION, rover.getPositionX());
        assertEquals(ORIGINAL_POSITION, rover.getPositionY());
    }

    @Test
    void advance_directionNorthX5Y5_directionNorthX5Y4() {
        Rover rover = new Rover(ORIGINAL_POSITION, ORIGINAL_POSITION, 'n');
        rover.advance();
        assertEquals('n', rover.getDirection());
        assertEquals(ORIGINAL_POSITION, rover.getPositionX());
        assertEquals(4, rover.getPositionY());
    }

    @Test
    void advance_directionEastX5Y5_directionEastX6Y5() {
        Rover rover = new Rover(ORIGINAL_POSITION, ORIGINAL_POSITION, 'e');
        rover.advance();
        assertEquals('e', rover.getDirection());
        assertEquals(6, rover.getPositionX());
        assertEquals(ORIGINAL_POSITION, rover.getPositionY());
    }

    @Test
    void advance_directionSouthX5Y5_directionSouthX6Y5() {
        Rover rover = new Rover(ORIGINAL_POSITION, ORIGINAL_POSITION, 's');
        rover.advance();
        assertEquals('s', rover.getDirection());
        assertEquals(ORIGINAL_POSITION, rover.getPositionX());
        assertEquals(6, rover.getPositionY());
    }

    @Test
    void advance_directionWestX5Y5_directionWestX4Y5() {
        Rover rover = new Rover(ORIGINAL_POSITION, ORIGINAL_POSITION, 'w');
        rover.advance();
        assertEquals('w', rover.getDirection());
        assertEquals(4, rover.getPositionX());
        assertEquals(ORIGINAL_POSITION, rover.getPositionY());
    }

    @Test
    void moveBack_directionNorthX5Y5_directionNorthX5Y6() {
        Rover rover = new Rover(ORIGINAL_POSITION, ORIGINAL_POSITION, 'n');
        rover.moveBack();
        assertEquals('n', rover.getDirection());
        assertEquals(ORIGINAL_POSITION, rover.getPositionX());
        assertEquals(6, rover.getPositionY());
    }

    @Test
    void moveBack_directionEastX5Y5_directionEastX4Y5() {
        Rover rover = new Rover(ORIGINAL_POSITION, ORIGINAL_POSITION, 'e');
        rover.moveBack();
        assertEquals('e', rover.getDirection());
        assertEquals(4, rover.getPositionX());
        assertEquals(ORIGINAL_POSITION, rover.getPositionY());
    }

    @Test
    void moveBack_directionSouthX5Y5_directionSouthX5Y4() {
        Rover rover = new Rover(ORIGINAL_POSITION, ORIGINAL_POSITION, 's');
        rover.moveBack();
        assertEquals('s', rover.getDirection());
        assertEquals(ORIGINAL_POSITION, rover.getPositionX());
        assertEquals(4, rover.getPositionY());
    }

    @Test
    void moveBack_directionWestX5Y5_directionWestX6Y5() {
        Rover rover = new Rover(ORIGINAL_POSITION, ORIGINAL_POSITION, 'w');
        rover.moveBack();
        assertEquals('w', rover.getDirection());
        assertEquals(6, rover.getPositionX());
        assertEquals(ORIGINAL_POSITION, rover.getPositionY());
    }
}
