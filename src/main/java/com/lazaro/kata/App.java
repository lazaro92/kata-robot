package com.lazaro.kata;

import com.lazaro.kata.model.Direction;
import com.lazaro.kata.model.Rover;
import com.lazaro.kata.model.World;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner reader = new Scanner(System.in);
        System.out.println("Insert horizontal map size:");
        int sizex = reader.nextInt();
        System.out.println("Insert vertical map size:");
        int sizey = reader.nextInt();

        System.out.println("Insert horizontal initial robot position:");
        int roverPosX = reader.nextInt();
        System.out.println("Insert vertical initial robot position:");
        int roverPosY = reader.nextInt();
        System.out.println("Insert initial robot direction:");
        String roverDirection = reader.next();

        Direction direction;

        switch (roverDirection) {
            case "e" -> direction = Direction.EAST;
            case "s" -> direction = Direction.SOUTH;
            case "w" -> direction = Direction.WEST;
            default -> direction = Direction.NORTH;
        }

        World world = new World(sizex, sizey);
        Rover rover = new Rover(roverPosX, roverPosY, direction, world);

        do {
            System.out.println("Insert command (f = forward, b = backward, l = turn left, r = turn right):");
            String command = reader.next();
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
            System.out.printf(
                    "Rover is at x:%d y:%d facing:%s%n",
                    rover.getPositionX(),
                    rover.getPositionY(),
                    rover.getDirection().getValue());
            System.out.println(rover.printData());
        } while (true);
    }
}
