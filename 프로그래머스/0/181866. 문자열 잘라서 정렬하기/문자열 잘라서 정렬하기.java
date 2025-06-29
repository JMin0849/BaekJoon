import java.util.Arrays;
class Solution {
    public String[] solution(String myString) {
        String[] arr = myString.trim().split("x");
        String[] answer = Arrays.stream(arr)
                                .filter(i -> !i.isEmpty())
                                .sorted()
                                .toArray(String[]::new);
        return answer;
    }
}