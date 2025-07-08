class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length * k];

        for (int i = 0; i < picture.length; i++) {
            // 각 줄의 문자를 k번 반복해서 한 줄 생성
            StringBuilder sb = new StringBuilder();
            for (char c : picture[i].toCharArray()) {
                sb.append(String.valueOf(c).repeat(k));
            }
            String line = sb.toString();

            // 그 줄을 k번 answer에 넣기
            for (int j = 0; j < k; j++) {
                answer[i * k + j] = line;
            }
        }

        return answer;
    }
}