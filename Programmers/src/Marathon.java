import java.io.*;
import java.util.*;

public class Marathon {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};
        for (int i = 0; i < participant.length; i++) {
            map.put(participant[i], map.getOrDefault(participant[i], 0) + 1);
        }

        for (int i = 0; i < completion.length; i++) {
            map.put(completion[i], map.get(completion[i]) - 1);
        }

        for (String s : map.keySet()) {
            if (map.get(s) != 0) {
                for (int i = 0; i < map.get(s); i++) {
                    System.out.print(s + " ");
                }
            }
        }
    }
}
