import java.io.*;
import java.util.*;

public class Solution_3273 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        HashSet<Integer> hs = new HashSet<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());
            hs.add(num);
        }
        int x = Integer.parseInt(br.readLine());
        int answer = 0;

        for (Integer h : hs) {
            if (hs.contains(x - h)) {
                answer++;
            }
        }

        System.out.println(answer);
    }
}
