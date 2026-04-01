import java.io.*;
import java.util.*;

public class Solution_11659 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] num = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            num[i] = Integer.parseInt(st.nextToken());
        }

        int[] prefix = new int[n];
        prefix[0] = num[0];
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + num[i];
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int I = Integer.parseInt(st.nextToken()) - 1;
            int J = Integer.parseInt(st.nextToken()) - 1;

            int sum;
            if (I == 0) {
                sum = prefix[J];
            } else {
                sum = prefix[J] - prefix[I - 1];
            }

            System.out.println(sum);
        }
    }
}
