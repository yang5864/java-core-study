import java.util.*;

public class WordChange {

    // 두 단어가 1개의 알파벳만 다른지 확인하는 메서드
    private boolean canConvert(String word1, String word2) {
        int diffCount = 0;
        for (int i = 0; i < word1.length(); i++) {
            if (word1.charAt(i) != word2.charAt(i)) {
                diffCount++;
            }
            if (diffCount > 1) return false;
        }
        return diffCount == 1;
    }

    public int solution(String begin, String target, String[] words) {
        // target이 words에 포함되어 있는지 확인
        boolean containsTarget = false;
        for (String w : words) {
            if (w.equals(target)) {
                containsTarget = true;
                break;
            }
        }
        if (!containsTarget) return 0;

        // BFS를 위한 Queue 및 방문 처리 배열
        Queue<Node> queue = new ArrayDeque<>();
        boolean[] visited = new boolean[words.length];

        queue.add(new Node(begin, 0));

        while (!queue.isEmpty()) {
            Node current = queue.poll();

            // target 도달 시 변환 횟수 반환
            if (current.word.equals(target)) {
                return current.count;
            }

            for (int i = 0; i < words.length; i++) {
                // 아직 방문하지 않았고, 한 글자만 차이나는 단어라면 큐에 삽입
                if (!visited[i] && canConvert(current.word, words[i])) {
                    visited[i] = true;
                    queue.add(new Node(words[i], current.count + 1));
                }
            }
        }

        return 0;
    }

    // 큐에 저장할 상태 객체
    static class Node {
        String word;
        int count;

        Node(String word, int count) {
            this.word = word;
            this.count = count;
        }
    }
}

