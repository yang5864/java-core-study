import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Solution_9375 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        for (int i = 0; i < tc; i++) {
            int n = Integer.parseInt(br.readLine());

            HashMap<String, Integer> map = new HashMap<>(); // 옷의 종류(eyewear, face 등)이 키값, 해당 종류의 갯수가 value

            for (int j = 0; j < n; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                String noNeed = st.nextToken(); // 의상 명
                String kind = st.nextToken();   // 의상 종류
                if (map.containsKey(kind)) {    // 이미 있는 종류면 해당 종류에 하나 추가
                    map.put(kind, map.get(kind) + 1);
                } else {    // 처음 등장한 종류면 1로
                    map.put(kind, 1);
                }
            }

            int result = 1;
            for (int count : map.values()) {    //예를 들어 2, 1 이 value 였다면
                result *= (count + 1);  // 3 * 2
            }
            result -= 1;    // 아무것도 안입은 경우 1개 제외
            System.out.println(result);
        }
    }
}
