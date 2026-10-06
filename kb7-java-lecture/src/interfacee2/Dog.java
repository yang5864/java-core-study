package interfacee2;

import java.io.*;
import java.util.*;

public class Dog implements Animal {
    @Override
    public void eat() {
        System.out.println("강아지가 사료를 먹습니다!");
    }

    @Override
    public void sleep() {
        System.out.println("강아지가 꿀잡을 잡니다!");
    }
}
