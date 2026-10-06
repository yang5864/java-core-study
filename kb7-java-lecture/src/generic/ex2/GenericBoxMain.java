package generic.ex2;

import java.io.*;
import java.util.*;

public class GenericBoxMain {
    public static void main(String[] args) throws Exception {
        GenericBox<Integer> intBox = new GenericBox<Integer>();
        intBox.setValue(10);
        System.out.println("intBox value = " + intBox.getValue());

        GenericBox<String> strBox = new GenericBox<>();
        strBox.setValue("빅나티를 변기에 넣고서 내려");
        System.out.println("strBox value = " + strBox.getValue());
    }
}
