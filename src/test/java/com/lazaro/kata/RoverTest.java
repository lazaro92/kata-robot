package com.lazaro.kata;


import com.lazaro.kata.model.Rover;
import com.lazaro.kata.model.World;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RoverTest {

    static World world;

    static final int ORIGINAL_POSITION = 5;
    static final int WORLD_SIZE_X = 30;
    static final int WORLD_SIZE_Y = 20;

    @BeforeAll
    static void setUp() {
        world = new World(WORLD_SIZE_X, WORLD_SIZE_Y);
    }
    
    @Test
    void rotateRight_directionNorth_directionEast() {
        Rover rover = new Rover(ORIGINAL_POSITION, ORIGINAL_POSITION, 'n', world);
        rover.rotateRight();
        assertEquals('e', rover.getDirection());
        assertEquals(ORIGINAL_POSITION, rover.getPositionX());
        assertEquals(ORIGINAL_POSITION, rover.getPositionY());
    }

    @Test
    void rotateRight_directionEast_directionSouth() {
        Rover rover = new Rover(ORIGINAL_POSITION, ORIGINAL_POSITION, 'e', world);
        rover.rotateRight();
        assertEquals('s', rover.getDirection());
        assertEquals(ORIGINAL_POSITION, rover.getPositionX());
        assertEquals(ORIGINAL_POSITION, rover.getPositionY());
    }

    @Test
    void rotateRight_directionSouth_directionWest() {
        Rover rover = new Rover(ORIGINAL_POSITION, ORIGINAL_POSITION, 's', world);
        rover.rotateRight();
        assertEquals('w', rover.getDirection());
        assertEquals(ORIGINAL_POSITION, rover.getPositionX());
        assertEquals(ORIGINAL_POSITION, rover.getPositionY());
    }

    @Test
    void rotateRight_directionWest_directionNorth() {
        Rover rover = new Rover(ORIGINAL_POSITION, ORIGINAL_POSITION, 'w', world);
        rover.rotateRight();
        assertEquals('n', rover.getDirection());
        assertEquals(ORIGINAL_POSITION, rover.getPositionX());
        assertEquals(ORIGINAL_POSITION, rover.getPositionY());
    }

    @Test
    void rotateLeft_directionNorth_directionWest() {
        Rover rover = new Rover(ORIGINAL_POSITION, ORIGINAL_POSITION, 'n', world);
        rover.rotateLeft();
        assertEquals('w', rover.getDirection());
        assertEquals(ORIGINAL_POSITION, rover.getPositionX());
        assertEquals(ORIGINAL_POSITION, rover.getPositionY());
    }

    @Test
    void rotateLeft_directionEast_directionNorth() {
        Rover rover = new Rover(ORIGINAL_POSITION, ORIGINAL_POSITION, 'e', world);
        rover.rotateLeft();
        assertEquals('n', rover.getDirection());
        assertEquals(ORIGINAL_POSITION, rover.getPositionX());
        assertEquals(ORIGINAL_POSITION, rover.getPositionY());
    }

    @Test
    void rotateLeft_directionSouth_directionEast() {
        Rover rover = new Rover(ORIGINAL_POSITION, ORIGINAL_POSITION, 's', world);
        rover.rotateLeft();
        assertEquals('e', rover.getDirection());
        assertEquals(ORIGINAL_POSITION, rover.getPositionX());
        assertEquals(ORIGINAL_POSITION, rover.getPositionY());
    }

    @Test
    void rotateLeft_directionWest_directionSouth() {
        Rover rover = new Rover(ORIGINAL_POSITION, ORIGINAL_POSITION, 'w', world);
        rover.rotateLeft();
        assertEquals('s', rover.getDirection());
        assertEquals(ORIGINAL_POSITION, rover.getPositionX());
        assertEquals(ORIGINAL_POSITION, rover.getPositionY());
    }

    @Test
    void advance_directionNorthX5Y5_directionNorthX5Y4() {
        Rover rover = new Rover(ORIGINAL_POSITION, ORIGINAL_POSITION, 'n', world);
        rover.advance();
        assertEquals('n', rover.getDirection());
        assertEquals(ORIGINAL_POSITION, rover.getPositionX());
        assertEquals(4, rover.getPositionY());
    }

    @Test
    void advance_directionEastX5Y5_directionEastX6Y5() {
        Rover rover = new Rover(ORIGINAL_POSITION, ORIGINAL_POSITION, 'e', world);
        rover.advance();
        assertEquals('e', rover.getDirection());
        assertEquals(6, rover.getPositionX());
        assertEquals(ORIGINAL_POSITION, rover.getPositionY());
    }

    @Test
    void advance_directionSouthX5Y5_directionSouthX6Y5() {
        Rover rover = new Rover(ORIGINAL_POSITION, ORIGINAL_POSITION, 's', world);
        rover.advance();
        assertEquals('s', rover.getDirection());
        assertEquals(ORIGINAL_POSITION, rover.getPositionX());
        assertEquals(6, rover.getPositionY());
    }

    @Test
    void advance_directionWestX5Y5_directionWestX4Y5() {
        Rover rover = new Rover(ORIGINAL_POSITION, ORIGINAL_POSITION, 'w', world);
        rover.advance();
        assertEquals('w', rover.getDirection());
        assertEquals(4, rover.getPositionX());
        assertEquals(ORIGINAL_POSITION, rover.getPositionY());
    }

    @Test
    void moveBack_directionNorthX5Y5_directionNorthX5Y6() {
        Rover rover = new Rover(ORIGINAL_POSITION, ORIGINAL_POSITION, 'n', world);
        rover.moveBack();
        assertEquals('n', rover.getDirection());
        assertEquals(ORIGINAL_POSITION, rover.getPositionX());
        assertEquals(6, rover.getPositionY());
    }

    @Test
    void moveBack_directionEastX5Y5_directionEastX4Y5() {
        Rover rover = new Rover(ORIGINAL_POSITION, ORIGINAL_POSITION, 'e', world);
        rover.moveBack();
        assertEquals('e', rover.getDirection());
        assertEquals(4, rover.getPositionX());
        assertEquals(ORIGINAL_POSITION, rover.getPositionY());
    }

    @Test
    void moveBack_directionSouthX5Y5_directionSouthX5Y4() {
        Rover rover = new Rover(ORIGINAL_POSITION, ORIGINAL_POSITION, 's', world);
        rover.moveBack();
        assertEquals('s', rover.getDirection());
        assertEquals(ORIGINAL_POSITION, rover.getPositionX());
        assertEquals(4, rover.getPositionY());
    }

    @Test
    void moveBack_directionWestX5Y5_directionWestX6Y5() {
        Rover rover = new Rover(ORIGINAL_POSITION, ORIGINAL_POSITION, 'w', world);
        rover.moveBack();
        assertEquals('w', rover.getDirection());
        assertEquals(6, rover.getPositionX());
        assertEquals(ORIGINAL_POSITION, rover.getPositionY());
    }

    @Test
    void advance_northWorldLimit_southWorldLimit() {
        Rover rover = new Rover(ORIGINAL_POSITION, 0, 'n', world);
        rover.advance();
        assertEquals('n', rover.getDirection());
        assertEquals(ORIGINAL_POSITION, rover.getPositionX());
        assertEquals(WORLD_SIZE_Y - 1, rover.getPositionY());
    }

    @Test
    void advance_eastWorldLimit_westWorldLimit() {
        Rover rover = new Rover(WORLD_SIZE_X - 1, ORIGINAL_POSITION, 'e', world);
        rover.advance();
        assertEquals('e', rover.getDirection());
        assertEquals(0, rover.getPositionX());
        assertEquals(ORIGINAL_POSITION, rover.getPositionY());
    }

    @Test
    void advance_southWorldLimit_northWorldLimit() {
        Rover rover = new Rover(ORIGINAL_POSITION, WORLD_SIZE_Y-1, 's', world);
        rover.advance();
        assertEquals('s', rover.getDirection());
        assertEquals(ORIGINAL_POSITION, rover.getPositionX());
        assertEquals(0, rover.getPositionY());
    }

    @Test
    void advance_westWorldLimit_eastWorldLimit() {
        Rover rover = new Rover(0, ORIGINAL_POSITION, 'w', world);
        rover.advance();
        assertEquals('w', rover.getDirection());
        assertEquals(WORLD_SIZE_X - 1, rover.getPositionX());
        assertEquals(ORIGINAL_POSITION, rover.getPositionY());
    }

    @Test
    void moveBack_northWorldLimit_southWorldLimit() {
        Rover rover = new Rover(ORIGINAL_POSITION, 0, 's', world);
        rover.moveBack();
        assertEquals('s', rover.getDirection());
        assertEquals(ORIGINAL_POSITION, rover.getPositionX());
        assertEquals(WORLD_SIZE_Y - 1, rover.getPositionY());
    }

    @Test
    void moveBack_eastWorldLimit_westWorldLimit() {
        Rover rover = new Rover(WORLD_SIZE_X - 1, ORIGINAL_POSITION, 'w', world);
        rover.moveBack();
        assertEquals('w', rover.getDirection());
        assertEquals(0, rover.getPositionX());
        assertEquals(ORIGINAL_POSITION, rover.getPositionY());
    }

    @Test
    void moveBack_southWorldLimit_northWorldLimit() {
        Rover rover = new Rover(ORIGINAL_POSITION, WORLD_SIZE_Y - 1, 'n', world);
        rover.moveBack();
        assertEquals('n', rover.getDirection());
        assertEquals(ORIGINAL_POSITION, rover.getPositionX());
        assertEquals(0, rover.getPositionY());
    }

    @Test
    void moveBack_westWorldLimit_eastWorldLimit() {
        Rover rover = new Rover(0, ORIGINAL_POSITION, 'e', world);
        rover.moveBack();
        assertEquals('e', rover.getDirection());
        assertEquals(WORLD_SIZE_X - 1, rover.getPositionX());
        assertEquals(ORIGINAL_POSITION, rover.getPositionY());
    }
}
