package generic.method;

import java.io.*;
import java.util.*;
import java.lang.Integer;

public class World2 {
    public static void main(String[] args) {
        GenericAptApt<Integer> integerAptApt = new GenericAptApt<>();
        String type = integerAptApt.genericMethod1(10).getClass().getName();
        System.out.println(type);

        String str = GenericAptApt.genericMethod2("문자열");
        System.out.println(str);

        Double doubleValue = GenericAptApt.numberMethod(10.3);
    }
}
