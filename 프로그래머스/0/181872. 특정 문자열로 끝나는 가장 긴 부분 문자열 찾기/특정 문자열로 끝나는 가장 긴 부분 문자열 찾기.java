class Solution {
    public String solution(String myString, String pat) {
        String answer = "";
        
        for(int i = 0;i<myString.length()+1;i++){
            String tmp = myString.substring(0, i);
            if(tmp.endsWith(pat)){
                answer = tmp;
            }
        }
        
        return answer;
    }
}