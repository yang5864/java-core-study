package generic.ex3;

import java.io.*;
import java.util.*;

public class PairMain {
    public static void main(String[] args) throws Exception {
        Pair<String, String> nameData = new Pair<> ( "name" , "양승환" ) ;
        Pair<String, Integer> ageData = new Pair<>("age", 27);
        Pair<String, Boolean> marriedData = new Pair<>("married", false) ;

        System.out.println("nameData = " + nameData.getValue());
        System.out.println("ageData = " + ageData.getValue());
        System.out.println("marriedData = " + marriedData.getValue());

        System.out.println(nameData);
        System.out.println(ageData);
        System.out.println(marriedData);
    }
}
