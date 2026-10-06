import java.io.*;
import java.util.*;

public class Solution_14940 {
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    static int n, m;
    static int[][] map;
    static int[][] distance;    // 방문 여부랑 거리 둘다 저장


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        map = new int[n][m];
        distance = new int[n][m];
        int[] target = new int[2];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());

                // 기본적으로 -1로 초기화
                distance[i][j] = -1;

                if (map[i][j] == 2) {
                    target[0] = i;
                    target[1] = j;
                    distance[i][j] = 0;
                } else if (map[i][j] == 0) {
                    distance[i][j] = 0;
                }
            }
        }

        bfs(target);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                sb.append(distance[i][j]).append(" ");
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }

    private static void bfs(int[] target) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(target);

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int curX = current[0];
            int curY = current[1];

            // 4방향 탐색
            for (int i = 0; i < 4; i++) {
                int nx = curX + dx[i];
                int ny = curY + dy[i];

                // 지도 안벗어났는지 확인
                if (nx >= 0 && nx < n && ny >= 0 && ny < m) {
                    // 갈 수 있는 땅이고 아직 미방문이라면
                    if (map[nx][ny] == 1 && distance[nx][ny] == -1) {
                        distance[nx][ny] = distance[curX][curY] + 1;
                        queue.add(new int[]{nx, ny});
                    }
                }
            }
        }
    }
}
