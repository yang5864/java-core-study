package interfacee;

public class Circle implements Shape {
    private String color;
    private double radius;
    private final double PI = Math.PI;

    public Circle(String color, double radius) {
        this.color = color;
        this.radius = radius;
    }

    @Override
    public double area() {
        return PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return PI * radius * 2;
    }

    public void printCircle() {
        System.out.println("색상 : " + this.color);
        printInfo();
    }
}
