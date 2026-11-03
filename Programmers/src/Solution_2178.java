import java.io.*;
import java.util.*;

public class Solution_2178 {
    static int N, M;
    static int[][] map;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        map = new int[N][M];

        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < M; j++) {
                map[i][j] = line.charAt(j) - '0';
            }
        }

        bfs(0, 0);

        // (N, M) 위치의 최소 칸 수 출력
        System.out.println(map[N - 1][M - 1]);
    }

    static void bfs(int startX, int startY) {
        Queue<int[]> queue = new ArrayDeque<>();
        queue.add(new int[]{startX, startY});

        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            int x = cur[0];
            int y = cur[1];

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                // 미로 범위 벗어나면 패스
                if (nx < 0 || nx >= N || ny < 0 || ny >= M) continue;

                // 이동할 수 있는 칸(1)인 경우
                if (map[nx][ny] == 1) {
                    // 이전 위치 값 + 1을 통해 거리 기록
                    map[nx][ny] = map[x][y] + 1;
                    queue.add(new int[]{nx, ny});
                }
            }
        }
    }
}
