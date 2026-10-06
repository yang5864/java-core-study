package interfacee2;

import java.io.*;
import java.util.*;

public class TetzMain {
    public static void main(String[] args) throws Exception {
        Dog dog = new Dog();
        Tetz tetz = new Tetz();

        animalDo(dog);
        animalDo(tetz);
        humanDo(tetz);
    }

    public static void animalDo(Animal animal) {
        animal.eat();
        animal.sleep();
    }

    public static void humanDo(Human human) {
        human.think();
    }
}
