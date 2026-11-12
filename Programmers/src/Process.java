import java.util.*;

public class Process {
    public int solution(int[] priorities, int location) {
        // [원래 인덱스, 우선순위]를 저장하는 큐
        Queue<int[]> queue = new LinkedList<>();

        // 현재 남은 프로세스 중 가장 높은 우선순위를 O(1)로 확인하기 위한 최대 힙
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < priorities.length; i++) {
            queue.offer(new int[]{i, priorities[i]});
            maxHeap.offer(priorities[i]);
        }

        int answer = 0;

        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            int curIdx = cur[0];
            int curPriority = cur[1];

            // 현재 꺼낸 프로세스가 가장 높은 우선순위인 경우 (실행)
            if (curPriority == maxHeap.peek()) {
                answer++;
                maxHeap.poll();

                // 찾고자 하는 위치의 프로세스라면 결과 반환
                if (curIdx == location) {
                    return answer;
                }
            } else {
                // 더 높은 우선순위가 남아있다면 큐의 맨 뒤로 다시 삽입
                queue.offer(cur);
            }
        }

        return answer;
    }
}
