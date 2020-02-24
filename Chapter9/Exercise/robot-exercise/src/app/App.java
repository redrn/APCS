package app;

import becker.robots.*;

public class App {
    public static void main(String[] args) throws Exception {
        City paris = new City();
        Robot karel = new Robot(paris, 0, 1, Direction.EAST);
        Thing theThing = new Thing(paris, 1, 2);
        Wall wall1 = new Wall(paris, 3, 2, Direction.NORTH);
        Flasher f1 = new Flasher(paris, 4, 4);
        f1.turnOn();
        
        karel.move();
        karel.move();
        karel.pickThing();
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.putThing();
        karel.move();
    }
}