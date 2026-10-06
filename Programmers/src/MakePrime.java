import java.io.*;
import java.util.*;

public class MakePrime {
    private static boolean isPrime(int n) {
        if (n < 2) return false;

        for (int i = 2; i * i <= n ; i++) {
            if (n % i == 0) return false;
        }

        return true;
    }
    public static void main(String[] args) {
        int[] nums = new int[10];
        int n = nums.length;
        int answer = 0;

        for (int i = 0; i < n-2; i++) {
            for (int j = i+1; j < n-1; j++) {
                for (int k = j+1; k < n; k++) {
                    int sum = nums[i] + nums[j] + nums[k];
                    if (isPrime(sum)) {
                        answer++;
                    }
                }
            }
        }
        System.out.println(answer);
    }
}
