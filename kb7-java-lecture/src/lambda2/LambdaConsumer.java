package lambda2;

import java.io.*;
import java.util.*;
import java.util.function.Consumer;

public class LambdaConsumer {
    public static void main(String[] args) {
        Consumer<String> consumer = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println("익명 클래스로 전달 받은 " + s);
            }
        };
        consumer.accept("한동안 놉니다!!");

        Consumer<String> consumer2 = (s) -> System.out.println("람다로 전달 받은 " + s);
        consumer2.accept("다음주 화요일까지 잇힝!");

        Consumer<String> consumer3 = System.out::println;
        consumer3.accept("전 다다음주 부터 휴가입니다!!!");
    }

}
