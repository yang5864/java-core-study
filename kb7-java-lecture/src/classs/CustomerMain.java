package classs;

import java.io.*;
import java.util.*;

public class CustomerMain {
    public static void main(String[] args) throws Exception {
        Customer customer1 = new Customer();

        customer1.name = "홍상우";
        customer1.age = 27;
        customer1.total = 1000000;
        customer1.blacklist = true;

        System.out.println("고객님의 이름 :  " + customer1.name);
        System.out.println("고객님의 나이 : " + customer1.age);
        System.out.println("고객님이 총 사용한 금액 : " + customer1.total);
        System.out.println("고객님의 블랙리스트 여부 : " + customer1.blacklist);
    }
}
