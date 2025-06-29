import java.util.*;
class Solution {
    public List solution(String[] strArr) {
        List answer = new ArrayList<>();
        int cnt = 0;
        for(int i=0;i<strArr.length;i++){
            if(!strArr[i].contains("ad")){
                answer.add(strArr[i]);
            }
        }
        
        return answer;
    }
}