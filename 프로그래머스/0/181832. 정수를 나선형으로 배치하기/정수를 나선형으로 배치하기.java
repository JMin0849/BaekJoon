class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int value = 1;
        int row = 0;
        int col = 0;
        int direction = 0;
        
        while (value <= n * n) {
            answer[row][col] = value++;
            
            if (direction == 0) {
                if (col == n - 1 || answer[row][col + 1] != 0) {
                    direction = 1;
                    row++;
                } else {
                    col++;
                }
            } else if (direction == 1) {
                if (row == n - 1 || answer[row + 1][col] != 0) {
                    direction = 2;
                    col--;
                } else {
                    row++;
                }
            } else if (direction == 2) {
                if (col == 0 || answer[row][col - 1] != 0) {
                    direction = 3;
                    row--;
                } else {
                    col--;
                }
            } else {
                if (row == 0 || answer[row - 1][col] != 0) {
                    direction = 0;
                    col++;
                } else {
                    row--;
                }
            }
        }
        
        return answer;
    }
}


// 처음에 [i][j]에서 j만 증가 right
// 그 다음은 i 증가 그 다음은 j 감소
// 그 다음 i 감소 
// 위 부분 반복
// 플래그를 세워서 right, left, up, down일때 끝까지 숫자 증가?