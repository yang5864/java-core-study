package exception.uncheck;

import java.io.*;
import java.util.*;

public class Service {
    public static void main(String[] args) throws Exception {
        Repository repo = new Repository();
        try {
            repo.callException();
        } catch (MyUncheckException e) {
            e.printStackTrace();
        }

        System.out.println("막았는가!?");
    }
}
