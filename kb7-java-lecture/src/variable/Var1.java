package variable;

import java.io.*;
import java.util.*;

public class Var1 {
    public static void main(String[] args) throws Exception {
        double a = 2.3;
        int b = (int) a;

        int c = 3;
        int d = 2;
        double div = (double) c / d;
        System.out.println(div);

        String str = "a + b = ";
        int e = 10;
        System.out.println(str + e);

        int f = 10;
        char g = 'g';
        System.out.println(f + g);

        int h = 1;
        int i = 0;

        i = h++;
        System.out.println("i = " + i + " h = " + h);
    }
}
