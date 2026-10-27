import java.util.*;

class NExpresser {
    public int solution(int N, int number) {
        // N과 number가 같으면 N을 1번만에 가능
        if (N == number) return 1;

        // Set[i] : N을 i번 사용해서 만들 수 있는 수들의 집합
        List<Set<Integer>> dp = new ArrayList<>();
        for (int i = 0; i <= 8; i++) {
            dp.add(new HashSet<>());
        }

        // 1번 사용 : N자체만 존재
        dp.get(1).add(N);

        for (int k = 2; k <= 8; k++) {
            // 1. N을 k번 연속 붙인 수 추가
            int repeated = Integer.parseInt(String.valueOf(N).repeat(k));
            dp.get(k).add(repeated);

            // 2. Set[i]와 Set[k-1]의 요소들을 사칙연산
            for (int i = 1; i < k; i++) {
                Set<Integer> setA = dp.get(i);
                Set<Integer> setB = dp.get(k - i);

                for (Integer a : setA) {
                    for (Integer b : setB) {
                        dp.get(k).add(a + b);
                        dp.get(k).add(a - b);
                        dp.get(k).add(a * b);
                        if (b != 0) {
                            dp.get(k).add(a / b);
                        }
                    }
                }
            }

            if (dp.get(k).contains(number)) return k;
        }

        // 8번 이하로 못만들면 -1 반환
        return -1;
    }
}