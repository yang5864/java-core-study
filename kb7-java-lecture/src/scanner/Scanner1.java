package scanner;

import java.io.*;
import java.util.*;

public class Scanner1 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("문자열을 입력하세요: ");
        String str = scanner.nextLine();
        System.out.println("입력한 문자열은?! : " + str);

        System.out.print("정수를 입력하세요 : ");
        int num = scanner.nextInt();
        System.out.println("입력한 정수는?! : " + num);
    }
}
