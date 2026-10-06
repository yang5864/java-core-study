package exception.basic;

import java.io.*;
import java.util.*;

public class ExceptionLetitgo {
    public static void main(String[] args) throws Exception {
        try {
            int[] arr = {1,2,3,4,5};
            System.out.println(arr[5]);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("나오나요?");
    }
}
