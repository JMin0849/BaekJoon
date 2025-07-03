class Solution {
    public int[] solution(int[] arr) {
        int n = arr.length;
        int targetLength = 1;
        
        while(targetLength < n){
            targetLength *= 2;
        }
        
        if(targetLength == n){
            return arr;
        }
        
        int[] answer = new int[targetLength];
        for (int i = 0; i < n; i++) {
            answer[i] = arr[i];
        }
        
        for (int i = n; i < targetLength; i++) {
            answer[i] = 0;
        }
        return answer;
    }
}