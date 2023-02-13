package com.lazaro.kata;

import com.lazaro.kata.model.Robot;
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
        
        Robot robot = new Robot(roverPosX, roverPosY, roverDirection.charAt(0));
        World world = new World(sizex, sizey, robot);

        do {
            System.out.println("Insert command (f = forward, b = backward, l = turn left, r = turn right):");
            String command = reader.next();
            if (command.equals("f")) {
                world.getRobot().advance();
            }
            if (command.equals("b")) {
                world.getRobot().moveBack();
            }
            if (command.equals("l")) {
                world.getRobot().rotateLeft();
            }
            if (command.equals("r")) {
                world.getRobot().rotateRight();
            }
            System.out.println(String.format(
                    "Rover is at x:%d y:%d facing:%s",
                    world.getRobot().getPositionX(),
                    world.getRobot().getPositionY(),
                    world.getRobot().getDirection())
            );
        } while (true);
    }
}
