package access.refactor;

import java.io.*;
import java.util.*;

public class AccountRefactor {
    public String bank; //은행명
    String grade;   //회원등급
    private String name;    //계좌 소유주
    private int total;  // 은행 잔고

    public AccountRefactor(String bank, String grade, String name, int total) {
        this.bank = bank;
        this.grade = grade;
        this.name = name;
        this.total = total;
    }

    public void print() {
        System.out.println("은행 잔고는? : " + this.total);
    }
}
