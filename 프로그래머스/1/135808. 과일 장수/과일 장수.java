import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int[][] box = new int[score.length / m][m];
        int answer = 0;
        int idx = score.length - 1;
        
        Arrays.sort(score);
        for (int i = 0; i < score.length / m; i++) {
            for (int j = m - 1; j >= 0; j--) {
                if (idx < 0) break;
                box[i][j] = score[idx--];
            }
        }
        
        for (int i = 0; i < score.length / m; i++) {
            int appleCnt = 0;
            
            for (int j = 0; j < m; j++) {
                if (box[i][j] != 0) appleCnt++;
            }
            answer += box[i][0] * appleCnt;
        }
        
        return answer;
    }
}