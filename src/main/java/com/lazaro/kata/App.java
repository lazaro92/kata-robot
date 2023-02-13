package com.lazaro.kata;

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
        
        Rover rover = new Rover(roverPosX, roverPosY, roverDirection.charAt(0));
        World world = new World(sizex, sizey, rover);

        do {
            System.out.println("Insert command (f = forward, b = backward, l = turn left, r = turn right):");
            String command = reader.next();
            if (command.equals("f")) {
                world.getRover().advance();
            }
            if (command.equals("b")) {
                world.getRover().moveBack();
            }
            if (command.equals("l")) {
                world.getRover().rotateLeft();
            }
            if (command.equals("r")) {
                world.getRover().rotateRight();
            }
            System.out.println(String.format(
                    "Rover is at x:%d y:%d facing:%s",
                    world.getRover().getPositionX(),
                    world.getRover().getPositionY(),
                    world.getRover().getDirection())
            );
        } while (true);
    }
}
