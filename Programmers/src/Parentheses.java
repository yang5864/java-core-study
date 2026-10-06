import java.util.*;

public class Parentheses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        boolean answer = true;
        Stack stack = new Stack();

        for (int i = 0; i < s.length(); i++) {
            char c =  s.charAt(i);
            if (c == '(') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    answer = false;
                }
                stack.pop();
            }
        }
    }
}
