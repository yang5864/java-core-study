import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_11727 {
    public static void main(String[] args) throws IOException {
        // 마지막 타일 기준
        // 1) 세로 2x1 한 개로 끝남 -> dp[i-1]
        // 2) 가로 1x2 두 개로 끝남 -> dp[i-2]
        // 3) 정사각형 2x2 한 개로 끝남 -> dp[i-2]
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] dp = new int[1001];

        dp[1] = 1;
        dp[2] = 3;
        for (int i = 3; i <= 1000; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2] * 2) % 10007;
        }

        System.out.println(dp[n]);
    }
}
