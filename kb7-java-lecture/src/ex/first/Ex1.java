package ex.first;

import java.io.*;
import java.util.*;

public class Ex1 {
    public static void main(String[] args) throws Exception {
        int score = 85;
        // int score = 93;

        if (score >= 90) {
            System.out.println("점수가 90보다 큽니다.");
            System.out.println("등급은 A입니다.");
        } else {
            System.out.println("점수가 90보다 작습니다.");
            System.out.println("등급은 B입니다.");
        }
    }
}
