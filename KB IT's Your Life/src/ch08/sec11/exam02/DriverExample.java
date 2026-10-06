package ch08.sec11.exam02;

import java.io.*;
import java.util.*;

public class DriverExample {
    public static void main(String[] args) throws Exception {
        Driver driver = new Driver();

        System.out.println("운전할 차를 선택하세요. 1) Taxi, 2) Bus, 3) Truck ,,,");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        Vehicle cars[] = {
                new Taxi(),
                new Bus(),
                new Truck()
        };

        cars[num - 1].run();
    }
}
