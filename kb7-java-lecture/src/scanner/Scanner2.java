package scanner;

import java.io.*;
import java.util.*;

public class Scanner2 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("문자열을 입력하세요. (종료를 원하시면 exit 입력) : ");
            String str = scanner.nextLine();

            if (str.equals("exit")) {
                System.out.println("프로그램을 종료합니다!");
                break;
            }

            System.out.println("입력한 문자열 : " + str);
        }
    }
}
