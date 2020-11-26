package com.afs.tdd;

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
        if (commands.equals("M")) {
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
        } else if (commands.equals("L")) {
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
            if (this.getDirection().equals("S")) {
                this.direction = "W";
            } else if (this.getDirection().equals("E")) {
                this.direction = "S";
            } else {
                this.direction = "E";
            }
        }
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
