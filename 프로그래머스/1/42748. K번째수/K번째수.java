import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        // 1. commands.length 만큼 반복문 돌린다.
        // 2. array의 commands[0]~commands[1] 범위 만큼 뽑아서 ArrayList에 삽입 후 정렬
        // 3. ArrayList의 commands[2]번째 숫자를 answer에 추가

        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            
            ArrayList<Integer> list = new ArrayList<>();
            
            for (int j = commands[i][0] - 1; j <= commands[i][1] - 1; j++) {
                list.add(array[j]);
            }
            
            Collections.sort(list);
            answer[i] = list.get(commands[i][2] - 1);
        }

        return answer;
    }
}