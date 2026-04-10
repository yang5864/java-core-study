import java.io.*;
import java.util.*;

public class Solution_2751 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] input = new int[N];

        for (int i = 0; i < N; i++) {
            input[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(input);

        StringBuilder sb = new StringBuilder();

        for (int i : input) {
            sb.append(i).append('\n');
        }

        System.out.println(sb);
    }
}
