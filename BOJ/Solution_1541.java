import java.io.*;
import java.util.*;

public class Solution_1541 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        String[] parts = input.split("-");
        // parts = ["55", "50+40", "30+20"]

        int result = 0;

        for (int i = 0; i < parts.length; i++) {
            String[] nums = parts[i].split("\\+");

            int sum = 0;
            for (String num : nums) {
                sum += Integer.parseInt(num);
            }

            if (i == 0) {   // - 나오기 전 첫번째 그룹(55)
                result += sum;
            } else {    // - 이후 그룹
                result -= sum;
            }
        }

        System.out.println(result);
    }
}
