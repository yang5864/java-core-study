package lambda;

import java.io.*;
import java.util.*;

interface Clickable {
    void click();
}
public class LambdaCant2 {
    public static void main(String[] args) throws Exception {
        Clickable counter = new Clickable() {
            private int count = 0;
            @Override
            public void click() {
                count++;
                System.out.println("클릭 횟수 : " + count);
            }
        };

        counter.click();
        counter.click();
        counter.click();

        int count = 0;
        Clickable lambdaCounter = () -> {
//            count++;
            System.out.println("클릭 횟수 : " + count);
        };

        int[] count2 = {0};
        Clickable lambdaCounter2 = () -> {
            count2[0]++;
            System.out.println("클릭 횟수 : " + count2[0]);
        };
    }
}
