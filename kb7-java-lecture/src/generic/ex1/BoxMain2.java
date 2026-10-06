package generic.ex1;

import java.io.*;
import java.util.*;

public class BoxMain2 {
    public static void main(String[] args) throws Exception {
        ObjBox intBox = new ObjBox();
        intBox.setObj(10);
        Integer integer = (Integer) intBox.getObj();
        System.out.println("intBox value = " + integer);
    }
}
