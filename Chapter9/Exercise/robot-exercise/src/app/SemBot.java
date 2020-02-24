package app;

import becker.robots.*;

public class SemBot extends Robot {
    
    SemBot(City aCity, int aStreet, int anAvenue, Direction aDirection) {
        super(aCity, aStreet, anAvenue, aDirection);
    }

    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }

    public void turnAround() {
        turnLeft();
        turnLeft();
        turnLeft();
        turnLeft();
    }

    boolean isFacingNorth() {
        if (getDirection() == Direction.NORTH) {
            return true;
        }
        return false;
    }

    boolean isFacingSouth() {
        if (getDirection() == Direction.SOUTH) {
            return true;
        }
        return false;
    }

    boolean isFacingEast() {
        if (getDirection() == Direction.EAST) {
            return true;
        }
        return false;
    }

    boolean isFacingWest() {
        if (getDirection() == Direction.WEST) {
            return true;
        }
        return false;
    }

    void faceNorth() {
        while (getDirection() != Direction.NORTH) {
            turnLeft();
        }
    }

    void faceSouth() {
        while (getDirection() != Direction.SOUTH) {
            turnLeft();
        }
    }

    void faceEast() {
        while (getDirection() != Direction.EAST) {
            turnLeft();
        }
    }

    void faceWest() {
        while (getDirection() != Direction.WEST) {
            turnLeft();
        }
    }

    void move(int numBlocks) {
        for (int i = 0; i < numBlocks; i++) {
            move();
        }
    }

    void pickAllThings() {
        while (canPickThing()) {
            pickThing();
        }
    }

    void putAllThings() {
        for (int i = 0; i < countThingsInBackpack(); i++) {
            putThing();
        }
    }
}