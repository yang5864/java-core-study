package scanner;

import java.io.*;
import java.util.*;

public class ScannerEx2 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = (int)(Math.random() * 100);
        boolean incorrect = true;

        while(incorrect) {
            System.out.print("숫자를 입력하세요(0~99) : ");
            int guess = Integer.parseInt(br.readLine());

            if (guess > num) {
                System.out.println("Down");
            } else if (guess < num) {
                System.out.println("Up");
            } else {
                System.out.println("정답입니다!");
                incorrect = false;
            }
        }
    }
}
