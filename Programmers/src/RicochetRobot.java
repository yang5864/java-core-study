import java.util.*;

class RicochetRobot {

    // 상하좌우
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public int solution(String[] board) {
        int n = board.length;   // 행
        int m = board[0].length();    // 열

        int startX = -1, startY = -1;

        // 시작위치 R 탐색
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (board[i].charAt(j) == 'R') {
                    startX = i; // 시작 행
                    startY = j; // 시작 열
                    break;
                }
            }
        }
        return bfs(board, startX, startY, n, m);
    }

    private int bfs(String[] board, int startX, int startY, int n, int m) {
        Queue<int[]> q = new ArrayDeque<>();
        boolean[][] visited = new boolean[n][m];

        q.add(new int[]{startX, startY, 0});
        visited[startX][startY] = true;

        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int curX = cur[0];
            int curY = cur[1];
            int cnt = cur[2];

            // 목표 지점 G 도착 시 이동 횟수 리턴
            if (board[curX].charAt(curY) == 'G') {
                return cnt;
            }

            for (int i = 0; i < 4; i++) {
                int nx = curX;
                int ny = curY;

                // 벽 D 나 보드 경계 만날 때까지 한 방향으로 계속 미끄러짐
                while (true) {
                    int nextX = nx + dx[i];
                    int nextY = ny + dy[i];

                    // 벽이나 경계 만나면 break
                    if (nextX < 0 || nextX >= n || nextY < 0 || nextY >= m || board[nextX].charAt(nextY) == 'D') {
                        break;
                    }

                    nx = nextX;
                    ny = nextY;
                }

                // 미끄러지다가 최종적으로 멈춘 위치 방문 처리 및 큐 삽입
                if (!visited[nx][ny]) {
                    visited[nx][ny] = true;
                    q.add(new int[]{nx, ny, cnt + 1});
                }
            }
        }

        // 도달 못하는 경우
        return -1;
    }
}