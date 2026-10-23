import java.util.*;

public class FarthestNode {
    public int solution(int n, int[][] edge) {
        // 1. 그래프(인접리스트 초기화)
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int[] e : edge) {
            graph.get(e[0]).add(e[1]);
            graph.get(e[1]).add(e[0]);
        }

        // 2. 거리 저장 배열 + 방문 확인용
        int[] distances = new int[n + 1];
        Arrays.fill(distances, -1);

        // 3. BFS 준비
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(1);
        distances[1]= 0;

        int maxDist = 0;

        // 4. BFS 시작
        while (!queue.isEmpty()) {
            int cur = queue.poll();

            for (Integer neighbor : graph.get(cur)) {
                // 아직 미방문인 경우
                if (distances[neighbor] == -1) {
                    distances[neighbor] = distances[cur] + 1;
                    maxDist = Math.max(maxDist, distances[neighbor]);
                    queue.add(neighbor);
                }
            }
        }

        // 5. 가장 먼 거리(maxDist) 가진 노드 갯수 세기
        int answer = 0;

        for (int distance : distances) {
            if (distance == maxDist) answer++;
        }

        return answer;
    }
}
