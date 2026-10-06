package langg.equals;

import java.io.*;
import java.util.*;

public class EqualsMain {
    public static void main(String[] args) throws Exception {
        User user1 = new User("양승환", "yang5864");
        User user2 = new User("양승환", "yang5864");

        System.out.println(user1 == user2);
        System.out.println(user1.equals(user2));
    }
}
