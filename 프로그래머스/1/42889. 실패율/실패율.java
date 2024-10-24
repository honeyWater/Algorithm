import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        Map<Integer, Double> map = new HashMap<>();
        int[] notClear = new int[N+2];
        int[] totalUser = new int[N+1];
        int[] answer = new int[N];
        
        // 스테이지 별 클리어하지 못한 유저 수
        for (int i = 0; i < stages.length; i++) {
            notClear[stages[i]]++;
        }
        
        // 스테이지 별 총 도달한 유저 수
        totalUser[N] = notClear[N] + notClear[N+1];
        for (int i = N-1; i >= 1; i--) {
            totalUser[i] = notClear[i] + totalUser[i+1];
        }
        
        // 스테이지 별 실패율
        for (int i = 1; i < totalUser.length; i++) {
            if (notClear[i] == 0 || totalUser[i] == 0) {
                map.put(i, 0.0);
            } else {
                map.put(i, (double) notClear[i] / totalUser[i]);
            }
        }
        
        List<Integer> keySet = new ArrayList<>(map.keySet());
        keySet.sort((o1, o2) -> map.get(o2).compareTo(map.get(o1)));
        
        for (int i = 0; i < N; i++) {
            answer[i] = keySet.get(i);
        }
        
        return answer;
    }
}