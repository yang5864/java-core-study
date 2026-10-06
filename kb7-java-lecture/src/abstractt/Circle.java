package abstractt;

import java.io.*;
import java.util.*;

public class Circle extends Shape{
    private double radius;
    private final static double PI = Math.PI;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }


    @Override
    public double area() {
        return radius * radius * PI;
    }

    @Override
    public double perimeter() {
        return radius * 2 * PI;
    }


}