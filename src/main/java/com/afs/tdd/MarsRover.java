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
            if (this.getDirection().equals("S")) {
                this.yLocation--;
            } else if (this.getDirection().equals("E")) {
                this.xLocation++;
            } else {
                this.yLocation++;
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
