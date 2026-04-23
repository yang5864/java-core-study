import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            int score = 0;
            int cur = 1;

            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == 'O') {
                    score += cur;
                    cur++;
                } else {
                    cur = 1;
                }
            }

            System.out.println(score);
        }
    }
}
