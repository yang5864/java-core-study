import java.util.*;

public class PuzzlePiece {

    int[] dx = {-1, 1, 0, 0};
    int[] dy = {0, 0, -1, 1};

    public int solution(int[][] game_board, int[][] table) {
        int n = game_board.length;

        // 1. game_board에서 빈 공간(0) 추출
        List<List<int[]>> emptySpaces = extractShapes(game_board, 0, n);

        // 2. table에서 퍼즐 조각(1) 추출
        List<List<int[]>> puzzlePieces = extractShapes(table, 1, n);

        boolean[] usedPiece = new boolean[puzzlePieces.size()];
        int totalFilled = 0;

        // 3. 빈 공간마다 알맞은 퍼즐 조각 찾기
        for (List<int[]> space : emptySpaces) {
            for (int i = 0; i < puzzlePieces.size(); i++) {
                if (usedPiece[i]) continue;

                List<int[]> piece = puzzlePieces.get(i);
                if (space.size() != piece.size()) continue; // 칸 수가 다르면 매칭 불가능

                if (isMatch(space, piece)) {
                    usedPiece[i] = true;
                    totalFilled += piece.size();
                    break;
                }
            }
        }

        return totalFilled;
    }

    // BFS로 모양(연결된 영역) 추출 후 (0,0) 기준으로 정규화
    private List<List<int[]>> extractShapes(int[][] board, int targetVal, int n) {
        boolean[][] visited = new boolean[n][n];
        List<List<int[]>> shapes = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == targetVal && !visited[i][j]) {
                    List<int[]> shape = new ArrayList<>();
                    Queue<int[]> q = new LinkedList<>();

                    q.offer(new int[]{i, j});
                    visited[i][j] = true;

                    while (!q.isEmpty()) {
                        int[] cur = q.poll();
                        shape.add(cur);

                        for (int d = 0; d < 4; d++) {
                            int nr = cur[0] + dx[d];
                            int nc = cur[1] + dy[d];

                            if (nr >= 0 && nr < n && nc >= 0 && nc < n) {
                                if (!visited[nr][nc] && board[nr][nc] == targetVal) {
                                    visited[nr][nc] = true;
                                    q.offer(new int[]{nr, nc});
                                }
                            }
                        }
                    }
                    shapes.add(normalize(shape));
                }
            }
        }
        return shapes;
    }

    // 좌표를 (0, 0) 기준으로 변환 및 정렬
    private List<int[]> normalize(List<int[]> shape) {
        int minR = Integer.MAX_VALUE;
        int minC = Integer.MAX_VALUE;

        for (int[] p : shape) {
            minR = Math.min(minR, p[0]);
            minC = Math.min(minC, p[1]);
        }

        List<int[]> normalized = new ArrayList<>();
        for (int[] p : shape) {
            normalized.add(new int[]{p[0] - minR, p[1] - minC});
        }

        // 비교를 쉽게 하기 위해 좌표 정렬
        normalized.sort((a, b) -> a[0] != b[0] ? Integer.compare(a[0], b[0]) : Integer.compare(a[1], b[1]));
        return normalized;
    }

    // 4가지 회전 방향에 대해 두 영역이 완벽히 일치하는지 확인
    private boolean isMatch(List<int[]> space, List<int[]> piece) {
        List<int[]> currentPiece = piece;

        for (int rot = 0; rot < 4; rot++) {
            if (isSame(space, currentPiece)) {
                return true;
            }
            currentPiece = rotate(currentPiece);
        }
        return false;
    }

    // 90도 회전 시키고 다시 정규화
    private List<int[]> rotate(List<int[]> shape) {
        List<int[]> rotated = new ArrayList<>();
        for (int[] p : shape) {
            // (r, c) -> (c, -r) 형태로 회전 후 정규화 과정에서 양수로 재조정됨
            rotated.add(new int[]{p[1], -p[0]});
        }
        return normalize(rotated);
    }

    // 두 정규화된 좌표 리스트가 같은지 비교
    private boolean isSame(List<int[]> a, List<int[]> b) {
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i)[0] != b.get(i)[0] || a.get(i)[1] != b.get(i)[1]) {
                return false;
            }
        }
        return true;
    }
}
