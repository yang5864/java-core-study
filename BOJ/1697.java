import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        boolean[] visited = new boolean[100001];
        int[] dist = new int[100001];
        Arrays.fill(dist, -1);
        dist[N] = 0;
        visited[N] = true;

        Queue<Integer> q = new LinkedList<>();
        q.add(N);

        while (!q.isEmpty()) {
            int cur = q.poll();

            if (cur == K) {
                System.out.println(dist[cur]);
                break;
            }

            int[] nexts = {cur - 1, cur + 1, cur * 2};

            for (int next : nexts) {
                if (next < 0 || next > 100000) continue;
                if (visited[next]) continue;

                visited[next] = true;
                dist[next] = dist[cur] + 1;
                q.add(next);
            }
        }
    }
}
