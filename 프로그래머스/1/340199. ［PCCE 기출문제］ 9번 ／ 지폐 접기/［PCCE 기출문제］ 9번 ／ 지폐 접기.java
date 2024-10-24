import java.util.*;

class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        
        Arrays.sort(wallet);
        while (true) {
            int big = Math.max(bill[0], bill[1]);
            int small = Math.min(bill[0], bill[1]);
            
            if (small <= wallet[0] && big <= wallet[1]) {
                break;
            }
            
            if (bill[0] > bill[1]) {
                bill[0] /= 2;
            } else {
                bill[1] /= 2;
            }
            
            answer++;
        }
        
        return answer;
    }
}