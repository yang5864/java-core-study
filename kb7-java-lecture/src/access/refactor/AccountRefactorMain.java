package access.refactor;

import java.io.*;
import java.util.*;

public class AccountRefactorMain {
    public static void main(String[] args) throws Exception {
        AccountRefactor account = new AccountRefactor("국민은행", "골드", "양승환", 2100000000);

        System.out.println("public 요소 접근");
        System.out.println("은행명은? : " + account.bank);

        System.out.println("default 요소 접근");
        System.out.println("등급은? : " + account.grade);

//        System.out.println("private 요소 접근");
//        System.out.println("계좌 소유주는? : " + account.name);

        account.print();

    }
}
