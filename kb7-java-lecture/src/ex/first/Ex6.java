package ex.first;

import java.io.*;
import java.util.*;

public class Ex6 {
    public static void main(String[] args) throws Exception {
        int index = 1;
        int sum = 0;
        while (index <= 100) {
            sum += index;
            index++;
        }
        System.out.println("1~100 합 : " + sum);
    }
}
