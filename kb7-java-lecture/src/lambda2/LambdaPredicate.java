package lambda2;

import java.io.*;
import java.util.*;
import java.util.function.Predicate;

public class LambdaPredicate {
    public static void main(String[] args) {
        Predicate<String> predi = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                if (s.length() == 0) {
                    return true;
                } else  {
                    return false;
                }
            }
        };
        System.out.println(predi.test(""));
        System.out.println(predi.test("앞만 보고 가실게요~!"));

        Predicate<String> predi2 = s -> s.isEmpty();
        System.out.println(predi.test(""));
        System.out.println(predi.test("앞만 보고 가실게요~!"));
    }

}
