import java.io.*;
import java.util.*;

public class DividingPowerGrid {
    // 그래프 표현할 인접 리스트
    ArrayList<Integer>[] adjList;

    public int solution(int n, int[][] wires) {
        int minDiff = n; // 최댓값으로 초기화

        // 1. 인접리스트 초기화 및 그래프 생성
        adjList = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            adjList[i] = new ArrayList<>();
        }

        for (int[] wire : wires) {
            int v1 = wire[0];
            int v2 = wire[1];
            adjList[v1].add(v2);
            adjList[v2].add(v1);
        }

        // 2. 모든 전선을 하나씩 끊어보는 완전 탐색
        for (int[] wire : wires) {
            int v1 = wire[0];
            int v2 = wire[1];

            // 방문 여부 체크
            boolean[] visited = new boolean[n + 1];

            // v1과 v2가 끊어졌다고 가정하고
            // 1번 송전탑과 연결된 덩어리 크기를 dfs로 구함
            int countA = dfs(1, v1, v2, visited);

            // 반대편 덩어리 크기
            int countB = n - countA;

            int diff = Math.abs(countA - countB);

            // 최솟값 갱신
            minDiff = Math.min(minDiff, diff);
        }
        return minDiff;
    }

    private int dfs(int cur, int v1, int v2, boolean[] visited) {
        visited[cur] = true;
        int count = 1;  // 자기 자신 포함

        for (int next : adjList[cur]) {
            // 이미 방문 시 패스
            if (visited[next]) continue;

            // 가려는 길 양 끝이 끊어놓은 전선(v1-v2) 관계라면 패스
            if ((cur == v1 && next == v2) || (cur == v2 && next == v1)) {
                continue;
            }

            // 자식 노드들이 반환한 개수에 누적합
            count += dfs(next, v1, v2, visited);
        }
        return count;
    }
}
