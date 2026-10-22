import java.util.*;

public class SharedTaxiFare {
    public int solution(int n, int s, int a, int b, int[][] fares) {
        // 플로이드-워셜
        int INF = 20000000; // 200 * 100,000 이상
        int[][] dist = new int[n + 1][n + 1];

        for (int i = 1; i <= n; i++) {
            Arrays.fill(dist[i], INF);
            // 자기 자신에게 가는 거리는 0으로 초기
            dist[i][i] = 0;
        }

        for (int[] fare : fares) {
            int u = fare[0], v = fare[1], w = fare[2];
            dist[u][v] = w;
            dist[v][u] = w;
        }

        for (int k = 1; k <= n; k++) {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    dist[i][j] = Math.min(dist[i][j], dist[i][k] + dist[k][j]);
                }
            }
        }

        int answer = INF;
        for (int i = 1; i <= n; i++) {
            answer = Math.min(answer, dist[s][i] + dist[i][a] + dist[i][b]);
        }

        return answer;
    }
}
