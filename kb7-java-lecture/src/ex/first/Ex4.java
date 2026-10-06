package ex.first;

import java.io.*;
import java.util.*;

public class Ex4 {
    public static void main(String[] args) throws Exception {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println("1~100 합 : " + sum);
    }
}
