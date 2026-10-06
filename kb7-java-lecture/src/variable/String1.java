package variable;

import java.io.*;
import java.util.*;

public class String1 {
    public static void main(String[] args) throws Exception {
        String str1 = "abc";
        String str2 = "def";

        boolean result1 = "abc".equals("def");
        boolean result2 = str1.equals("abc");
        boolean result3 = str2.equals("def");

        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
        System.out.println("result3 = " + result3);

        System.out.println("abc" == "abc");
        System.out.println("abc" == "def");
        System.out.println("abc" == new String("abc"));
    }
}
