package com.afs.tdd;

import java.util.Arrays;

public class MarsRover {
    private int xLocation;
    private int yLocation;
    private String direction;

    public MarsRover(int xLocation, int yLocation, String direction) {
        this.xLocation = xLocation;
        this.yLocation = yLocation;
        this.direction = direction;
    }

    public void executeCommands(String commands) {
        Arrays.stream(commands.split("")).forEach(command -> {
            if (command.equals("M")) {
                switch (this.getDirection()) {
                    case "S":
                        this.yLocation--;
                        break;
                    case "E":
                        this.xLocation++;
                        break;
                    case "W":
                        this.xLocation--;
                        break;
                    case "N":
                        this.yLocation++;
                        break;
                }
            } else if (command.equals("L")) {
                switch (this.getDirection()) {
                    case "S":
                        this.direction = "E";
                        break;
                    case "E":
                        this.direction = "N";
                        break;
                    case "W":
                        this.direction = "S";
                        break;
                    case "N":
                        this.direction = "W";
                        break;
                }
            } else {
                switch (this.getDirection()) {
                    case "S":
                        this.direction = "W";
                        break;
                    case "E":
                        this.direction = "S";
                        break;
                    case "W":
                        this.direction = "N";
                        break;
                    case "N":
                        this.direction = "E";
                        break;
                }
            }
        });

    }

    public int getXLocation() {
        return xLocation;
    }

    public void setXLocation(int xLocation) {
        this.xLocation = xLocation;
    }

    public int getYLocation() {
        return yLocation;
    }

    public void setYLocation(int yLocation) {
        this.yLocation = yLocation;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }
}
