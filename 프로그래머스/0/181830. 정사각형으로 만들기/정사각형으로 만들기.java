class Solution {
    public int[][] solution(int[][] arr) {
        
        int rows = arr.length;
        int cols = arr[0].length;
        int max = Math.max(rows, cols);
        
        int[][] answer = new int[max][max];
        
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                answer[i][j] = arr[i][j];
            }
        }
        
        return answer;
    }
}