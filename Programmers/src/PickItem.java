import java.util.*;

class PickItem {
    public int solution(int[][] rectangle, int characterX, int characterY, int itemX, int itemY) {

        /**
         * 그리드 상에서 직사각형 테두리 따라서 이동 시,
         * ㄷ자 형태로 꺾이는 구간 있으면 BFS 도중에 테두리 안쪽 빈 공간으로 건너뛰어감
         * 해결법 : 모든 좌표(직사각형, 시작점, 아이템 점)를 2배로 확대한다.
         * 좌표를 2배로 늘리면 테두리와 테두리 사이 간격이 벌어져서,
         * BFS 탐색 시 올바르게 테두리만 따라서 이동함.
         **/

        int[][] map = new int[102][102];

        // 1. 직사각형 2배 확대하여 map에 넣기
        for (int[] r : rectangle) {
            int x1 = r[0] * 2, y1 = r[1] * 2;   // 좌측 하단
            int x2 = r[2] * 2, y2 = r[3] * 2;   // 우측 상단

            for (int i = x1; i <= x2; i++) {
                for (int j = y1; j <= y2; j++) {
                    // 직사각형 내부면 2 (기본이 0으로 초기화되므로 0으로 마킹하면 안됨)
                    if (i > x1 && i < x2 && j > y1 && j < y2) {
                        map[i][j] = 2;
                    } else if (map[i][j] != 2) { // else 쓰면 다음 직사각형 처리할 때 내부를 다시 1로 덮어 씌울 수 있음
                        map[i][j] = 1;
                    }
                }
            }
        }

        // 2. BFS 시작
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};

        Queue<Node> queue = new ArrayDeque<>();
        boolean[][] visited = new boolean[102][102];

        int startX = characterX * 2;
        int startY = characterY * 2;
        int targetX = itemX * 2;
        int targetY = itemY * 2;

        queue.add(new Node(startX, startY, 0));
        visited[startX][startY] = true;

        while (!queue.isEmpty()) {
            Node cur = queue.poll();
            int curX = cur.x;
            int curY = cur.y;
            int curDist = cur.dist;

            if (curX == targetX && curY == targetY) {
                return curDist / 2;
            }

            for (int i = 0; i < 4; i++) {
                int nx = curX + dx[i];
                int ny = curY + dy[i];

                if (nx >= 0 && nx < 102 && ny >= 0 && ny < 102) {
                    if (map[nx][ny] == 1 && !visited[nx][ny]) {
                        visited[nx][ny] = true;
                        queue.add(new Node(nx, ny, curDist + 1));
                    }
                }
            }
        }

        return 0;
    }

    static class Node {
        int x;
        int y;
        int dist;

        public Node(int x, int y, int dist) {
            this.x = x;
            this.y = y;
            this.dist = dist;
        }
    }
}