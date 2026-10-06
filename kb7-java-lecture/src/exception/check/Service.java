package exception.check;

import java.io.*;
import java.util.*;

public class Service {
    public static void main(String[] args) throws Exception {
        Repository repo = new Repository();

        try {
            repo.callRandException();
        } catch (MyCheckException2 e) {
            e.printStackTrace();
        }
    }
}
