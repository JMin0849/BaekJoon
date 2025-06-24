import java.util.Arrays;
class Solution {
    public StringBuilder solution(String my_string, int[] indices) {
        Arrays.sort(indices);
        StringBuilder sb = new StringBuilder(my_string);
        // 뒤에서부터 for문 돌아야함 앞에서부터하면 인덱스가 하나씩 밀림
        for(int i= indices.length-1;i>=0;i--){
            sb.deleteCharAt(indices[i]);
        }
        return sb;
    }
}