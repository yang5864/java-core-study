import java.util.*;

public class TargetNumber {
    public int solution(int[] numbers, int target) {
        return dfs(numbers, target, 0, 0);
    }

    private int dfs(int[] numbers, int target, int idx, int sum) {
        // 전부 다 돌은 경우0
        if (idx == numbers.length) {
            return sum == target ? 1 : 0;
        }

        // 더하는 경우와 빼는 경우의 수 각가 더해준다
        return dfs(numbers, target, idx + 1, sum + numbers[idx]) + dfs(numbers, target, idx + 1, sum - numbers[idx]);
    }
}
