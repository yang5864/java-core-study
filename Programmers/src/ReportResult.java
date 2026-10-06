import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];

        // 신고당한 횟수 저장
        Map<String, Integer> countMap = new HashMap<>();

        // 신고자 -> 신고당한 사람 저장
        Map<String, Set<String>> reportMap = new HashMap<>();
        for (String id : id_list) {
            reportMap.put(id, new HashSet<>());
        }

        // 전체 신고 내역 중복 제거
        Set<String> reportSet = new HashSet<>(Arrays.asList(report));

        // 중복 신고 제거하면서 저장
        for (String r : reportSet) {
            String[] parts = r.split(" ");
            String reporter = parts[0];
            String reported = parts[1];

            Set<String> reportedSet = reportMap.get(reporter);

            // 중복 신고가 아닌 경우만 처리
            if (!reportedSet.contains(reported)) {
                reportedSet.add(reported);

                int count = countMap.getOrDefault(reported, 0);
                countMap.put(reported, count + 1);
            }
        }

        // 메일 개수 계산
        for (int i = 0; i < id_list.length; i++) {
            String reporter = id_list[i];

            for (String reported : reportMap.get(reporter)) {
                if (countMap.getOrDefault(reported, 0) >= k) {
                    answer[i]++;
                }
            }
        }

        return answer;
    }
}

public class ReportResult {
    public static void main(String[] args) {
        Solution sol = new Solution();

        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {
                "muzi frodo",
                "apeach frodo",
                "frodo neo",
                "muzi neo",
                "apeach muzi"
        };
        int k = 2;

        int[] result = sol.solution(id_list, report, k);

        System.out.println(Arrays.toString(result)); // [2, 1, 1, 0]
    }
}