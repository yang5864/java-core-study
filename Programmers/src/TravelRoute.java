import java.util.*;

class TravelRoute {
    boolean[] visited;
    ArrayList<String> allRoutes = new ArrayList<>();

    public String[] solution(String[][] tickets) {
        visited = new boolean[tickets.length];

        // 알파벳 순으로 항공권 정렬
        Arrays.sort(tickets, (o1, o2) -> {
            if (o1[0].equals(o2[0])) {
                return o1[1].compareTo(o2[1]);
            }
            return o1[0].compareTo(o2[0]);
        });

        dfs("ICN", "ICN", tickets, 0);

        // 가장 먼저 완성된(알파벳 순으로 가장 앞선) 루트 반환
        return allRoutes.get(0).split(" ");
    }

    private void dfs(String cur, String route, String[][] tickets, int count) {
        // 이미 완성된 경로를 하나 찾았음녀 더 이상 탐색 안함
        if (!allRoutes.isEmpty()) {
            return;
        }

        // 모든 항공권을 사용한 경우
        if (count == tickets.length) {
            allRoutes.add(route);
            return;
        }

        for (int i = 0; i < tickets.length; i++) {
            // 아직 사용 안했고, 현재 위치에서 출발하는 항공권인 경우
            if (!visited[i] && tickets[i][0].equals(cur)) {
                visited[i] = true;
                dfs(tickets[i][1], route + " " + tickets[i][1], tickets, count + 1);
                visited[i] = false; // 백트래킹
            }
        }
    }
}