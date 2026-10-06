package langg.object;

import java.io.*;
import java.util.*;

public class Child extends Parent{
    String name = "child";
    public void childMethod() {
        System.out.println("Child.childMethod");
    }

    @Override
    public String toString() {
        return "Child{" +
                "name='" + name + '\'' +
                '}';
    }
}
