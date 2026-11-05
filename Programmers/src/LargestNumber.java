import java.util.*;

class LargestNumber {
    public String solution(String number, int k) {
        StringBuilder answer = new StringBuilder();
        int len = number.length() - k;

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < number.length(); i++) {
            char c = number.charAt(i);

            // 스택이 비어있지 않고, (stack.peek()로 비교해야하는데 stack 비어있으면 안되니까)
            // 이전 숫자가 현재 숫자보다 작으며, (앞자리 일 수록 큰수가 와야하니까 앞에서 쳐내는게 유리)
            // 아직 더 제거할 수 있을 때(k > 0) (아직 지울 수 있는 남은 기회)
            while (!stack.isEmpty() && stack.peek() < c && k > 0) {
                stack.pop();
                k--;
            }

            stack.push(c);
        }

        for (int i = 0; i < len; i++) {
            answer.append(stack.get(i));
        }
        return answer.toString();
    }
}