import java.io.*;
import java.util.*;

public class Solution_2577 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long square = 1;
        for (int i = 0; i < 3; i++) {
            int num = Integer.parseInt(br.readLine());
            square *= num;
        }
        String str = String.valueOf(square);

        int[] num = new int[10];
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            int idx = c - '0';
            num[idx]++;
        }

        for (int i : num) {
            System.out.println(i);
        }
    }
}
