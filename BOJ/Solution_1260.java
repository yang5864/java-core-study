import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Solution_1260 {
    static ArrayList<Integer>[] graph;
    static boolean[] visited;
    static int N, M, V;

    static void dfs(int node) {
        visited[node] = true;
        System.out.print(node + " ");
        for (Integer i : graph[node]) {
            if (!visited[i]) {
                dfs(i);
            }
        }
    }

    static void bfs(int start) {
        Queue<Integer> q = new LinkedList<>();

        q.add(start);
        visited[start] = true;

        while (!q.isEmpty()) {
            int cur = q.poll();
            System.out.print(cur + " ");

            for (Integer i : graph[cur]) {
                if (!visited[i]) {
                    visited[i] = true;
                    q.add(i);
                }
            }
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());   // 정점의 개수
        M = Integer.parseInt(st.nextToken());   // 간선의 개수
        V = Integer.parseInt(st.nextToken());   // 시작 정점 번호

        graph = new ArrayList[N + 1];
        visited = new boolean[N + 1];

        for (int i = 1; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            graph[a].add(b);
            graph[b].add(a);
        }

        for (int i = 1; i <= N; i++) {
            Collections.sort(graph[i]);
        }

        dfs(V);

        System.out.println();

        Arrays.fill(visited, false);

        bfs(V);
    }
}
