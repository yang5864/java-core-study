package ex.first;

import java.io.*;
import java.util.*;

public class Ex5 {
    public static void main(String[] args) throws Exception {
        for (int i = 2; i <= 9; i++) {
            System.out.println("*** " + i + "단" + " ***");
            for (int j = 1; j <= 9; j++) {
                int result = i * j;
                System.out.println(i + " x " + j + " = " + result);
            }
        }
    }
}
