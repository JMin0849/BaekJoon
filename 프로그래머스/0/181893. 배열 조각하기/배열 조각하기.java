import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] query) {
        int[] answer = Arrays.copyOf(arr, arr.length);

        for (int i = 0; i < query.length; i++) {
            if (answer.length == 0) break;
            if (i % 2 == 0) {
                // 0 ~ query[i] (포함)
                answer = Arrays.copyOfRange(answer, 0, Math.min(query[i] + 1, 
                                                                answer.length));
            } else {
                // query[i] ~ 끝까지 (포함)
                answer = Arrays.copyOfRange(answer, Math.min(query[i], answer.length),
                                            answer.length);
            }
        }

        return answer;
    }
}