import java.io.*;
import java.util.*;

public class Solution_1012 {
    static int M, N, K;
    static int[][] map;
    static boolean[][] visited;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            M = Integer.parseInt(st.nextToken());   // 가로
            N = Integer.parseInt(st.nextToken());   // 세로
            K = Integer.parseInt(st.nextToken());   // 배추 갯수

            map = new int[N][M];
            visited = new boolean[N][M];

            for (int j = 0; j < K; j++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                map[y][x] = 1; // y가 행, x가 열
            }

            int count = 0;  // 필요한 지렁이 갯수

            for (int j = 0; j < N; j++) {
                for (int k = 0; k < M; k++) {
                    // 배추가 있고 아직 방문 안한 경우
                    if (map[j][k] == 1 && !visited[j][k]) {
                        dfs(k, j);
                        count++;
                    }
                }
            }
            sb.append(count).append('\n');
        }
        System.out.print(sb);
    }

    static void dfs(int x, int y) {
        visited[y][x] = true;
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            // 범위 안벗어나고, 배추가 있고, 방문 아직 안한 경우
            if (nx >= 0 && nx < M && ny >= 0 && ny < N) {
                if (map[ny][nx] == 1 && !visited[ny][nx]) {
                    dfs(nx, ny);
                }
            }
        }
    }
}
