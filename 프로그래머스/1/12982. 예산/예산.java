import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);
        
        for (int i = 0; i < d.length; i++) {
            budget -= d[i];
            if (budget < 0) break;
            answer++; // 뺐을 때 0보다 크거나 같으면 지원가능하므로 증가
        }
        
        return answer;
    }
}