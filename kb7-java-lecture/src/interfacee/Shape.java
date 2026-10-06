package interfacee;

public interface Shape {
    double area();

    double perimeter();

    default void printInfo() {
        System.out.println("넓이 : " + area());
        System.out.println("둘레 : " + perimeter());
    }
}
