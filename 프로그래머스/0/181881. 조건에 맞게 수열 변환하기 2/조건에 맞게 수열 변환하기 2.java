import java.util.*;
class Solution {
    public int solution(int[] arr) {
        int cnt = 0;
        int[] answer = arr.clone();
        
        while(true){
            for(int i=0;i<arr.length;i++){
                if(arr[i] >=50 && arr[i] % 2 == 0){
                    arr[i]/=2;
                } else if(arr[i] <50 && arr[i] % 2 != 0){
                    arr[i]= arr[i]*2 + 1; 
            }
            }
            if(Arrays.equals(arr, answer)){
                break;
            }
                answer = arr.clone();
                cnt++;
            }
        
        return cnt;
    }
}