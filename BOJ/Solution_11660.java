import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_11660 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());   // 표의 크기
        int m = Integer.parseInt(st.nextToken());   // 합을 구해야하는 횟수

        int[][] num = new int[n][n];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                num[i][j] = Integer.parseInt(st.nextToken());
            }

        }

        int[][] prefix = new int[n][n];
        for (int i = 0; i < n; i++) {
            prefix[i][0] = num[i][0];
            for (int j = 1; j < n; j++) {
                prefix[i][j] = prefix[i][j - 1] + num[i][j];
            }
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken()) - 1;
            int y1 = Integer.parseInt(st.nextToken()) - 1;
            int x2 = Integer.parseInt(st.nextToken()) - 1;
            int y2 = Integer.parseInt(st.nextToken()) - 1;

            int sum = 0;
            for (int j = x1; j <= x2; j++) {
                if (y1 == 0) {
                    sum += prefix[j][y2];
                } else {
                    sum += prefix[j][y2] - prefix[j][y1 - 1];
                }
            }
            System.out.println(sum);
        }
    }
}
