package com.lazaro.kata;

import com.lazaro.kata.model.Robot;
import com.lazaro.kata.model.World;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
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
                if (roverDirection.equals("n")) {
                    roverPosY += 1;
                }
                if (roverDirection.equals("w")) {
                    roverPosX -= 1;
                }
                if (roverDirection.equals("s")) {
                    roverPosY -= 1;
                }
                if (roverDirection.equals("e")) {
                    roverPosX += 1;
                }
            }
            if (command.equals("b")) {
                if (roverDirection.equals("n")) {
                    roverPosY -= 1;
                }
                if (roverDirection.equals("w")) {
                    roverPosX += 1;
                }
                if (roverDirection.equals("s")) {
                    roverPosY += 1;
                }
                if (roverDirection.equals("e")) {
                    roverPosX -= 1;
                }
            }
            if (command.equals("l")) {
                if (roverDirection.equals("n")) {
                    roverDirection = "w";
                }
                if (roverDirection.equals("w")) {
                    roverDirection = "s";
                }
                if (roverDirection.equals("s")) {
                    roverDirection = "e";
                }
                if (roverDirection.equals("e")) {
                    roverDirection = "n";
                }
            }
            if (command.equals("r")) {
                if (roverDirection.equals("n")) {
                    roverDirection = "e";
                }
                if (roverDirection.equals("e")) {
                    roverDirection = "s";
                }
                if (roverDirection.equals("s")) {
                    roverDirection = "w";
                }
                if (roverDirection.equals("w")) {
                    roverDirection = "n";
                }
            }
            System.out.println(String.format("Rover is at x:%d y:%d facing:%s", roverPosX, roverPosY, roverDirection));
        } while (true);
    }
}
