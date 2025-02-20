import java.util.*;

class Solution {
    static List<int[]> arr = new ArrayList<>();
    
    public int[][] solution(int n) {
        hanoi(n, 1, 2, 3);
        
        return arr.stream().toArray(int[][]::new);
    }
    
    static void hanoi(int cnt, int start, int mid, int end) {
        if (cnt == 0) return;
        
        // A -> C로 옮긴다고 가정할 때,
	    // STEP 1 : N-1개를 A에서 B로 이동 (= start 지점의 N-1개의 원판을 mid 지점으로 옮긴다.)
        hanoi(cnt - 1, start, end, mid);
        
        // STEP 2 : 1개를 A에서 C로 이동 (= start 지점의 N번째 원판을 end지점으로 옮긴다.)
        arr.add(new int[]{start, end});
        
        // STEP 3 : N-1개를 B에서 C로 이동 (= mid 지점의 N-1개의 원판을 end 지점으로 옮긴다.)
        hanoi(cnt - 1, mid, start, end);
    }
}