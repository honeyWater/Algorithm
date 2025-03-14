import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] num1 = {1, 2, 3, 4, 5};
        int[] num2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] num3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] cnt = new int[3];
        
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == num1[i % 5]) {
                cnt[0]++;
            }
            if (answers[i] == num2[i % 8]) {
                cnt[1]++;
            }
            if (answers[i] == num3[i % 10]) {
                cnt[2]++;
            }
        }
        
        int max = Math.max(cnt[0], Math.max(cnt[1], cnt[2]));
        
        List<Integer> answer = new ArrayList<>(3);
        for (int i = 0; i < 3; i++) {
            if (cnt[i] == max) {
                answer.add(i + 1);
            }
        }
        
        return answer.stream().mapToInt(i->i.intValue()).toArray();
    }
}