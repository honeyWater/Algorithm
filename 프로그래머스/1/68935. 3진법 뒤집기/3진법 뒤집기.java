class Solution {
    public int solution(int n) {
        StringBuffer sb = new StringBuffer();
        int answer = 0;
        
        while (true) {
            if (n < 3) {
                sb.append(n);
                break;
            }
            
            sb.append(n % 3);
            n /= 3;
        }
        String s = sb.toString();
        int len = s.length();
        
        for (int i = 0; i < len; i++) {
            answer += Math.pow(3, i) * (s.charAt(len - 1 - i) - '0');
        }
        
        return answer;
    }
}