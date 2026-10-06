package lambda;

import java.io.*;
import java.util.*;

interface MathOperation {
    int add(int a, int b);

    int sub(int a, int b);
}

interface MathAdd {
    int add(int a, int b);
}

interface MathSub {
    int sub(int a, int b);
}

public class LambdaCant {
    public static void main(String[] args) throws Exception {
        MathOperation operation = new MathOperation() {
            @Override
            public int add(int a, int b) {
                return a + b;
            }

            @Override
            public int sub(int a, int b) {
                return a - b;
            }
        };

        System.out.println("익명 클래스는 인터페이스 하나로 메서드 2개 가능 하지옹 ㅇㅅㅇ, a + b = " + operation.add(10, 5));
        System.out.println("익명 클래스는 인터페이스 하나로 메서드 2개 가능 하지옹 ㅇㅅㅇ, a - b = " + operation.sub(10, 5));

        MathAdd add = (a, b) -> a + b;
        MathSub sub = (a, b) -> a - b;
        System.out.println("람다는 메서드 하나만 가능합니다 ㅇㅅaㅇ, a + b = " + add.add(10, 5));
        System.out.println("람다는 메서드 하나만 가능합니다 ㅇㅅaㅇ, a - b = " + sub.sub(10, 5));
    }
}
