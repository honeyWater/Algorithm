import java.util.*;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int zeroCnt = 0;
        int max = 7;
        
        for (int i = 0; i < 6; i++) {
            if (isExist(lottos[i], win_nums)) {
                max--;
            } else if (lottos[i] == 0) {
                zeroCnt++;
                max--;
            }
        }
        
        // 모두 틀린 번호라 max = 7 이면 6으로 반환되도록
        return new int[] {max == 7 ? 6 : max, max+zeroCnt > 6 ? 6 : max+zeroCnt};
    }
    
    private boolean isExist(int lottoNum, int[] win_nums) {
        for (int n : win_nums) {
            if (lottoNum == n) {
                return true;
            }
        }
        
        return false;
    }
}