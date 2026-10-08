class Network {
    public int solution(int n, int[][] computers) {
        int answer = 0;
        boolean[] visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                dfs(i, n, computers, visited);
                answer++;
            }
        }

        return answer;
    }

    private void dfs (int node, int n, int[][] computers, boolean[] visited) {
        visited[node] = true;

        for (int i = 0; i < n; i++) {
            // 연결돼있고 아직 미방문이면
            if (computers[node][i] == 1 && !visited[i]) {
                dfs(i, n, computers, visited);
            }
        }
    }
}