import java.io.*;
import java.util.*;

public class Solution_2606 {
    static ArrayList<Integer>[] graph;
    static boolean[] visited;
    static int count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int comNum = Integer.parseInt(br.readLine());
        int connectCom = Integer.parseInt(br.readLine());

        graph = new ArrayList[comNum + 1];
        visited = new boolean[comNum + 1];

        for (int i = 0; i < comNum + 1; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < connectCom; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            graph[a].add(b);
            graph[b].add(a);
        }

        dfs(1);
        System.out.println(count);
    }

    static void dfs(int node) {
        visited[node] = true;

        for (Integer next : graph[node]) {
            if (!visited[next]) {
                count++;
                dfs(next);
            }
        }
    }
}
