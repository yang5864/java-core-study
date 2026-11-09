import java.io.*;
import java.util.*;

public class Solution_7562 {
    static boolean[][] visited;
    static int[] dx = {1, 2, 2, 1, -1, -2, -2, -1};
    static int[] dy = {2, 1, -1, -2, -2, -1, 1, 2};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int l = Integer.parseInt(br.readLine());
            visited = new boolean[l][l];

            int[] start = new int[2];
            int[] end = new int[2];

            for (int j = 0; j < 2; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int k = 0; k < 2; k++) {
                    if (j == 0) {
                        start[k] = Integer.parseInt(st.nextToken());
                    } else {
                        end[k] = Integer.parseInt(st.nextToken());
                    }
                }
            }

            // 시작(start)과 끝(end)이 동일한 경우
            if (Arrays.equals(start, end)) {
                sb.append(0).append("\n");
                continue;
            }

            sb.append(bfs(l, start, end)).append("\n");
        }
        System.out.print(sb);
    }

    private static int bfs(int l, int[] start, int[] end) {
        Queue<int[]> queue = new ArrayDeque<>();

        queue.add(new int[]{start[0], start[1], 0});
        visited[start[0]][start[1]] = true;

        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            int x = cur[0];
            int y = cur[1];
            int count = cur[2];

            for (int i = 0; i < 8; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                // 범위 벗어나는지 확인
                if (nx < 0 || nx >= l || ny < 0 || ny >= l) continue;

                if (nx == end[0] && ny == end[1]) {
                    return count + 1;
                }


                // 방문하지 않은 곳 탐색
                if (!visited[nx][ny]) {
                    visited[nx][ny] = true;
                    queue.add(new int[]{nx, ny, count + 1});
                }
            }
        }

        return 0;
    }
}
