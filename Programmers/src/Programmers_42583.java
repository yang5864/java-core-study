import java.util.*;

public class Programmers_42583 {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Integer> bridge = new LinkedList<>();

        // 다리 길이 만큼 0으로 초기화 (다리 위 빈 공간)
        for (int i = 0; i < bridge_length; i++) {
            bridge.offer(0);
        }

        int time = 0;
        int bridgeWeight = 0;
        int truckIndex = 0;

        while (truckIndex < truck_weights.length) {
            time++;

            // 1초가 지났으므로 맨 앞에 있던 트럭이 다리를 빠져나감
            bridgeWeight -= bridge.poll();

            // 다음 트럭이 올라갈 수 있는지 확인
            if (bridgeWeight + truck_weights[truckIndex] <= weight) {
                bridge.offer(truck_weights[truckIndex]);
                bridgeWeight += truck_weights[truckIndex];
                truckIndex++;   // 다음 대기 트럭으로 인덱스 증가
            } else {
                // 무게 초과시 트럭이 올라가지 못하므로 0을 넣어 시간 경과를 표현
                bridge.offer(0);
            }
        }

        // 마지막 트럭 다리에 다 올라간 후 다리를 빠져나오는데 걸리는 시간까지 더해줌
        return time + bridge_length;
    }
}
