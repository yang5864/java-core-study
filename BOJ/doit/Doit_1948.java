package doit;

import java.io.*;
import java.util.*;

public class Doit_1948 {
    // 도시 번호와 걸리는 시간을 묶어줄 클래스
    static class Node {
        int target;
        int weight;

        Node(int target, int weight) {
            this.target = target;
            this.weight = weight;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        int[] inDegree = new int[n + 1];
        int[] answer = new int[n + 1];

        ArrayList<ArrayList<Node>> list = new ArrayList<>();
        ArrayList<ArrayList<Node>> reverseList = new ArrayList<>();

        for (int i = 0; i <= n; i++) {
            list.add(new ArrayList<>());
            reverseList.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());

            list.get(u).add(new Node(v, w));
            reverseList.get(v).add(new Node(u, w));

        }

        StringTokenizer st = new StringTokenizer(br.readLine());
        int oneStep = Integer.parseInt(st.nextToken());
        int rome = Integer.parseInt(st.nextToken());

        Queue<Integer> q = new ArrayDeque<>();
        for (int i = 1; i <= n; i++) {

            if (inDegree[i] == 0) {
                q.add(i);
            }
        }

        while (!q.isEmpty()) {
            int cur = q.poll();

//            for (int next : list.get(cur)) {
//
//            }
        }
    }
}
