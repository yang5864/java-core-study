import java.io.*;
import java.util.*;

public class Solution_18870 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int[] arr2 = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            arr2[i] = arr[i];
        }

        Arrays.sort(arr2);
        HashMap<Integer, Integer> map = new HashMap<>();

        int idx = 0;
        for (int x : arr2) {
            if (!map.containsKey(x)) {
                map.put(x, idx++);
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int x : arr) {
            sb.append(map.get(x)).append(" ");
        }

        System.out.println(sb);
    }
}
