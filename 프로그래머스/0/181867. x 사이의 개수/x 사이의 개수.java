import java.util.*;
class Solution {
    public List<Integer> solution(String myString) {
        List<Integer> result = new ArrayList<>();
        String[] answer = myString.split("x", -1);
        for(int i=0;i<answer.length;i++){
            result.add(answer[i].length());
        }
        
        return result;
    }
}