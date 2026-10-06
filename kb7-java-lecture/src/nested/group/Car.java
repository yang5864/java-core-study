package nested.group;

import java.io.*;
import java.util.*;

public class Car {
    private String model;
    public boolean isStated = false;

    public Car(String model) {
        this.model = model;
    }

    public void drive() {
        if (isStated == true) {
            System.out.println("차를 운전합니다.");
        } else {
            System.out.println("엔진을 켜주세요");
        }
    }
}
