class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String upperstr1 = myString.toUpperCase();
        String upperstr2 = pat.toUpperCase();
        if(upperstr1.contains(upperstr2)){
            answer = 1;
        } else{
            answer= 0;
        }
        
        return answer;
    }
}