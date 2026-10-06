package langg.wrapper;

import java.io.*;
import java.util.*;

public class CompareMain {
    public static void main(String[] args) throws Exception {
        Integer int1 = Integer.valueOf(10);
        Long long1 = 100L;
        Double double1 = 11.18;

        int intValue = int1;
        long longValue = long1;
        double doubleValue = double1;

        System.out.println(intValue);
        System.out.println(int1);
        System.out.println(longValue);
        System.out.println(long1);
        System.out.println(doubleValue);
        System.out.println(double1);
    }
}
