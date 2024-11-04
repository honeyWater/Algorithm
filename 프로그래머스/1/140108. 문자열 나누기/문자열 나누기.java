class Solution {
    public int solution(String s) {
        int answer = 0;
        int same = 1;
        int diff = 0;
        
        char now = s.charAt(0);
        for (int i = 1; i < s.length(); i++) {
            if (now == s.charAt(i)) {
                same++;
            } else {
                diff++;
            }
            
            if (i == s.length() - 1) { // 마지막 문자라면 분해 후 break
                answer++;
                break;
            } else if (same == diff) { // 마지막 문자가 아니고, 횟수가 같다면
                now = s.charAt(++i);
                answer++;
                same = 1;
                diff = 0;
                
                if (i == s.length() - 1) { // 횟수가 같아서 분해 했지만 그게 마지막 문자라면
                    answer++;
                    break;
                }
            }
        }
        
        return s.length() == 1 ? 1 : answer;
    }
}