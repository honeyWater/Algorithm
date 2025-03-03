import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] num1 = {1, 2, 3, 4, 5};
        int[] num2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] num3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        int score1 = 0, score2 = 0, score3 = 0;
        
        for (int i = 0; i < answers.length; i++) {
            int answer = answers[i];
            
            if (answer == num1[i % 5]) score1++;
            if (answer == num2[i % 8]) score2++;
            if (answer == num3[i % 10]) score3++;
        }
        
        int maxScore = Math.max(score1, Math.max(score2, score3));
        
        int count = 0;
        if (score1 == maxScore) count++;
        if (score2 == maxScore) count++;
        if (score3 == maxScore) count++;
        
        int[] result = new int[count];
        int idx = 0;
        
        if (score1 == maxScore) result[idx++] = 1;
        if (score2 == maxScore) result[idx++] = 2;
        if (score3 == maxScore) result[idx++] = 3;
        
        return result;
    }
}