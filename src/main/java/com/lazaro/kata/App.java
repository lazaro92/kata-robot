package com.lazaro.kata;

import com.lazaro.kata.exception.DirectionNotFoundException;
import com.lazaro.kata.exception.OutOfBoundsException;
import com.lazaro.kata.model.Direction;
import com.lazaro.kata.model.Rover;
import com.lazaro.kata.model.World;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args ) {
        Scanner reader = new Scanner(System.in);
        World world = null;
        Rover rover = null;


        try {
            System.out.println("Insert map size separated by comma (example 5,4 ):");
            world = generateWorldFromInput(reader.nextLine());

            System.out.println("Insert initial rover coordinates and direction (n = north, e = east, s = south, w = west) (example 2,1,e):");
            rover = generateRobotFromInput(reader.nextLine());

            assignWorldToRover(rover, world);
        } catch(NumberFormatException|DirectionNotFoundException|OutOfBoundsException exception) {
            System.err.println(exception.getMessage());
            System.exit(1);
        }

        String command;
        do {
            System.out.println("Insert command (f = forward, b = backward, l = turn left, r = turn right, e = exit):");
            command = reader.next();
            if (command.equals("f")) {
                rover.advance();
            }
            if (command.equals("b")) {
                rover.moveBack();
            }
            if (command.equals("l")) {
                rover.rotateLeft();
            }
            if (command.equals("r")) {
                rover.rotateRight();
            }
            if (!command.equals("e")) {
                System.out.printf("Rover is at x:%d y:%d facing:%s%n", rover.getPositionX(), rover.getPositionY(), rover.getDirection().getValue());
                System.out.println(rover.printData());
            }
        } while (!command.equals("e"));
        System.out.println("Disconnected from rover");
    }

    private static World generateWorldFromInput(String userInput) throws NumberFormatException {
        String[] strDimensions = userInput.split(",");
        int sizeX = Integer.parseInt(strDimensions[0]);
        int sizeY = Integer.parseInt(strDimensions[1]);

        return new World(sizeX, sizeY);
    }

    private static Rover generateRobotFromInput(String userInput) throws NumberFormatException, DirectionNotFoundException {
        String[] strRoverParams = userInput.split(",");
        int sizeX = Integer.parseInt(strRoverParams[0]);
        int sizeY = Integer.parseInt(strRoverParams[1]);
        String roverDirection = strRoverParams[2];

        Direction direction;
        switch (roverDirection) {
            case "n" -> direction = Direction.NORTH;
            case "e" -> direction = Direction.EAST;
            case "s" -> direction = Direction.SOUTH;
            case "w" -> direction = Direction.WEST;
            default  -> throw new DirectionNotFoundException();
        }

        return new Rover(sizeX, sizeY, direction);
    }

    private static void assignWorldToRover(Rover rover, World world) throws OutOfBoundsException {
        if ((rover.getPositionX() < 0 || rover.getPositionX() >= world.getSizeX())
        || (rover.getPositionY() < 0 || rover.getPositionY() >= world.getSizeY())) {
            throw new OutOfBoundsException();
        }
        rover.setWorld(world);
    }
}
