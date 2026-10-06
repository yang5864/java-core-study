package interfacee;

import java.io.*;
import java.util.*;

public class ShapeInterfaceMain {
    public static void main(String[] args) throws Exception {
        Rectangle rec = new Rectangle("orange", 10, 10);
        Circle circle = new Circle("skyblue", 3);

        rec.printInfo();
        rec.printRectangle();

        circle.printInfo();
        circle.printCircle();
    }
}
