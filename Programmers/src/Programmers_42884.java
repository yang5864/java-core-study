import java.util.*;

public class Programmers_42884 {
    public int solution(int[][] routes) {
        // 나가는 시점 진출 지점(routes[i][1]) 기준으로 정렬
        // 마지막에 설치해야 최대한 많은 차들은 만날 수 있으므로
        Arrays.sort(routes, (a, b) -> Integer.compare(a[1], b[1]));
        
        int count = 0;
        int lastCamera = -30001;

        for (int[] route : routes) {
            if (route[0] > lastCamera) {
                count++;
                lastCamera = route[1]; // 진출 지점에 새로 카메라 설치
            }
        }
        
        return count;
    }
}
