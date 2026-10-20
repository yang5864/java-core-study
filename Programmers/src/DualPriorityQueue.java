import java.util.*;

public class DualPriorityQueue {
    public int[] solution(String[] operations) {
        // 오름차순
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        // 내림차순
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        for (String op : operations) {
            String[] parts = op.split(" ");
            String command = parts[0];
            int value = Integer.parseInt(parts[1]);

            if (command.equals("I")) {
                minHeap.add(value);
                maxHeap.add(value);
            } else if (command.equals("D")) {
                // 큐가 비어있으면 무시
                if (minHeap.isEmpty()) continue;

                if (value == 1) {
                    // 최댓값 삭제
                    int max = maxHeap.poll();
                    minHeap.remove(max);
                } else if (value == -1) {
                    // 최솟값 삭제
                    int min = minHeap.poll();
                    maxHeap.remove(min);
                }
            }
        }

        if (minHeap.isEmpty()) {
            return new int[]{0, 0};
        }

        return new int[]{maxHeap.peek(), minHeap.peek()};
    }

}
