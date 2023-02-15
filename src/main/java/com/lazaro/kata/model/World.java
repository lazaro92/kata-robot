package com.lazaro.kata.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class World {
    private int sizeX;
    private int sizeY;

    public String generateMap(int roverXCord, int roverYCord, Direction roverDirection) {
        var mapBuilder = new StringBuilder();

        for (int y = 0; y < sizeY; y++) {
            for (int x = 0; x < sizeX; x++) {
                if (roverXCord == x && roverYCord == y) {
                    switch (roverDirection) {
                        case EAST -> mapBuilder.append("⮞");
                        case SOUTH -> mapBuilder.append("⮟");
                        case WEST -> mapBuilder.append("⮜");
                        default -> mapBuilder.append("⮝");
                    }
                }
                else {
                    mapBuilder.append("⎕");
                }
            }
            mapBuilder.append('\n');
        }

        return mapBuilder.toString();
    }
}
