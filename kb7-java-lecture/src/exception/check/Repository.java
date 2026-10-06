package exception.check;

import java.io.*;
import java.util.*;

public class Repository {
    public void callRandException() throws MyCheckException2 {
        Random rand = new Random();

        if (rand.nextBoolean()) {
            System.out.println("오늘은 운이 좋으시군요");
        } else {
            throw new MyCheckException2("오늘은 운이 없으시군요");
        }

        // 원하던 작업을 수행
    }
}
