class Solution {
    public int solution(String[] order) {
        int answer = 0;
        int ame = 0, cafe = 0;
        
        for(String str : order){
            if(str.contains("americano") || str.equals("anything")){
                ame+=1;
            }else{
                cafe+=1;
            }
        }
        
        return ame*4500 + cafe*5000;
    }
}