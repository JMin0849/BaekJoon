import java.util.*;

class Solution {
    public List<Integer> solution(int[] arr) {
        List<Integer> answer = new ArrayList<>();
        int cnt = 0;
        
        if(cnt < arr.length){
            for(int i=0;i<arr.length;i++){
                if(answer.isEmpty()){
                    answer.add(arr[cnt]);
                    cnt++;
                } else{
                    if(answer.get(answer.size() - 1) == arr[cnt]){
                        answer.remove(answer.size() - 1);
                        cnt++;
                    } else{
                        answer.add(arr[cnt]);
                        cnt++;
                    }
                    }
                }
            
                    }
        
        return answer.isEmpty() ? Collections.singletonList(-1) : answer;
    }
}