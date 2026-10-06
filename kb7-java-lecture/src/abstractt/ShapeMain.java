package abstractt;

import java.io.*;
import java.util.*;

public class ShapeMain {
    public static void main(String[] args) throws Exception {
        Rectangle rec = new Rectangle("orange", 10, 10);
        Circle circle = new Circle("skyblue", 3);

        rec.printInfo();
        circle.printInfo();
    }
}
