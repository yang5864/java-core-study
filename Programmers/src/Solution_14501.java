import java.io.*;
import java.util.*;

public class Solution_14501 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] T = new int[N + 1];
        int[] P = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            T[i] = Integer.parseInt(st.nextToken());
            P[i] = Integer.parseInt(st.nextToken());
        }

        // dp[i]: i일 부터 마지막 날까지 얻을 수 있는 최대 수익
        // 퇴사일(N+1일)을 고려하여 크기를 N+2로 설정
        int[] dp = new int[N + 2];

        for (int i = N; i >= 1; i--) {
            int nextDay = i + T[i];

            // 상담 완료하는 날이 퇴사일(N+1)을 초과하는 경우 (불가능한 경우)
            if (nextDay > N + 1) {
                dp[i] = dp[i + 1];
            } else {
                // 상담을 하는 경우와 하지 않는 경우 중 최댓값 선택
                dp[i] = Math.max(dp[i + 1], P[i] + dp[nextDay]);
            }
        }

        System.out.println(dp[1]);
    }
}
