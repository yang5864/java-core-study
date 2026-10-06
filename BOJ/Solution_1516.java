import java.io.*;
import java.util.*;

public class Solution_1516 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] inDegree = new int[N + 1];
        int[] time = new int[N + 1];
        int[] answer = new int[N + 1];

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for (int i = 0; i <= N; i++) {
            list.add(new ArrayList<>());
        }

        for (int i = 1; i <= N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            time[i] = Integer.parseInt(st.nextToken());

            while (true) {
                int num = Integer.parseInt(st.nextToken());
                if (num == -1) {
                    break;
                } else {
                    list.get(num).add(i);
                    inDegree[i]++;
                }
            }
        }

        Queue<Integer> q = new ArrayDeque<>();
        for (int i = 1; i <= N; i++) {
            answer[i] = time[i];
            if (inDegree[i] == 0) {
                q.add(i);
            }
        }

        while (!q.isEmpty()) {
            int cur = q.poll();

            for (int next : list.get(cur)) {
                answer[next] = Math.max(answer[next], answer[cur] + time[next]);

                inDegree[next]--;
                if (inDegree[next] == 0) {
                    q.add(next);
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= N; i++) {
            sb.append(answer[i]).append("\n");
        }

        System.out.print(sb);
    }
}
