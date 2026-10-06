package langg.object;

import java.io.*;
import java.util.*;

public class objectMain {
    public static void main(String[] args) throws Exception {
        Child child = new Child();

        System.out.println(child.toString());

        Object[] objects = {new Parent(), new Child(), new OtherClass()};


    }
}
