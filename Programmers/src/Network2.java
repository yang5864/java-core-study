class Network2 {
    static boolean[] visited;

    public int solution(int n, int[][] computers) {
        visited = new boolean[n];
        int answer = 0;

        for (int i = 0; i < n; i++) {
            if (!visited[i]){
                dfs(i, n, computers);
                answer++;
            }
        }

        return answer;
    }

    private void dfs (int cur, int n, int[][]computers){
        visited[cur] = true;

        for (int i = 0; i < n; i++) {
            if (computers[cur][i] == 1 && !visited[i]) {
                dfs(i, n, computers);
            }
        }
    }
}