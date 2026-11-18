import java.io.*;
import java.util.*;

public class Solution_13458 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] A = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        long answer = 0;

        for (int i : A) {
            int num = i - B;

            if (num <= 0) {
                answer++;
            } else {
                answer += (num / C) + (num % C == 0 ? 0 : 1) + 1;
            }

        }

        System.out.println(answer);
    }
}
