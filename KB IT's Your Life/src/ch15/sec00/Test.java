package ch15.sec00;

import java.io.*;
import java.util.*;

public class Test {
    public static void main(String[] args) throws Exception {
        List<String> list = new ArrayList<>();
        list.add("Test1");
        //초기 데이터 구성

        List<String> list2 = List.of("Test1", "Test2", "Test3");    // List.of 만든 배열은 불변 리스트임
        System.out.println(list2);

//        list2.add("test4");
        System.out.println(list2);

        Map<String, String> map = Map.of("k1", "v1", "k2", "v2");
        System.out.println(map);
    }
}
