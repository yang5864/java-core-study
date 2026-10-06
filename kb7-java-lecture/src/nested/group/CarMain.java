package nested.group;

import java.io.*;
import java.util.*;

public class CarMain {
    public static void main(String[] args) throws Exception {
        Car car = new Car("페라리");

        car.drive();

        Engine engine = new Engine();
        engine.start();

        car.isStated = true;

        car.drive();
    }
}
