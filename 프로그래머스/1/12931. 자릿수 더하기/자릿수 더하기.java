import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;

        while(true){
            if(n / 10 == 0 && n % 10 == 0) break;
            
            answer += (n % 10);
            n /= 10;
        }

        return answer;
    }
}