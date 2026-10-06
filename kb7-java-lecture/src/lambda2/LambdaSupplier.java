package lambda2;

import java.io.*;
import java.util.*;
import java.util.function.Supplier;

public class LambdaSupplier {
    public static void main(String[] args) {
        Supplier<String> sup = new Supplier<String>() {
            @Override
            public String get() {
                return "익명 클래스 보급!";
            }
        };
        String str1 = sup.get();
        System.out.println(str1);

        Supplier<String> sup2 = () -> "람다 보급!";
        String str2 = sup2.get();
        System.out.println(str2);
    }

}
