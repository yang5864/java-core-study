package classs;

import java.io.*;
import java.util.*;

public class FishBreadMain {
    public static void main(String[] args) throws Exception {
        FishBread fish1 = new FishBread("팥", "잉어", 888);
        FishBread fish2 = new FishBread();

        System.out.println("붕어빵의 맛은? : " + fish1.taste);
        System.out.println("붕어빵의 모양은? : " + fish1.shape);
        System.out.println("붕어빵의 가격은? : " + fish1.price);
        System.out.println("붕어빵의 생산 시각은? : " + fish1.makeTime);

        System.out.println("붕어빵의 맛은? : " + fish2.taste);
        System.out.println("붕어빵의 모양은? : " + fish2.shape);
        System.out.println("붕어빵의 가격은? : " + fish2.price);
        System.out.println("붕어빵의 생산 시각은? : " + fish2.makeTime);
    }
}
