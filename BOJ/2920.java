import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[8];

        for (int i = 0; i < 8; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        boolean isAsc = true;
        boolean isDesc = true;
        for (int i = 1; i < 8; i++) {
            if (arr[i] != arr[i - 1] + 1) {
                isAsc = false;
            }
            if (arr[i] != arr[i - 1] - 1) {
                isDesc = false;
            }
        }

        if (isAsc) {
            System.out.println("ascending");
        } else if (isDesc) {
            System.out.println("descending");
        } else {
            System.out.println("mixed");
        }
    }
}
