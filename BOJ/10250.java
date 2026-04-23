import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int H = Integer.parseInt(st.nextToken());   // 호텔 층수
            int W = Integer.parseInt(st.nextToken());   // 각 층 방수
            int N = Integer.parseInt(st.nextToken());   // 몇 번째 손님

            int floor;
            if (N % H == 0) {
                floor = H;
            } else {
                floor = N % H;
            }

            int roomNum = (N - 1) / H + 1;

            System.out.println(floor * 100 + roomNum);
        }
    }
}
