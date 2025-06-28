class Solution {
    public String solution(String my_string, String alp) {
        String strUpp = alp.toUpperCase(); 
        return my_string.replaceAll(alp, strUpp);
    }
}