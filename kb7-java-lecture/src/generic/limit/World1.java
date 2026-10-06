package generic.limit;

import java.io.*;
import java.util.*;

public class World1 {
    public static void main(String[] args) {
        GenericAptApt<Integer> integerAptApt1 = new GenericAptApt<>();
        integerAptApt1.setNumber(1118);
        System.out.println(integerAptApt1.getNumber());

        GenericAptApt<Long> longAptApt = new GenericAptApt<>();
        longAptApt.setNumber(711L);
        System.out.println(longAptApt.getNumber());

        Double seungHwanSaengil = longAptApt.transDouble();
        System.out.println(seungHwanSaengil);
    }
}
