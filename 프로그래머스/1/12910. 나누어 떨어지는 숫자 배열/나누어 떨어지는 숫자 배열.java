import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> list = new ArrayList<>();
        int[] answer;

        for (int a : arr) {
            if (a % divisor == 0) {
                list.add(a);
            }
        }

        if (list.isEmpty()) {
            return new int[]{-1};
        } else {
            Collections.sort(list);
            answer = new int[list.size()];

            for (int i = 0; i < list.size(); i++) {
                answer[i] = list.get(i);
            }
            return answer;
        }
    }
}