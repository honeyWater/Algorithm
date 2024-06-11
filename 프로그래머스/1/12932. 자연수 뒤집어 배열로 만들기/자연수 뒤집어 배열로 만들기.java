class Solution {
    public int[] solution(long n) {
        String s = n + "";
        int len = s.length();
        int[] answer = new int[len];
        
        for(int i=0; i<len; i++){
            answer[len - 1 - i] = s.charAt(i) - '0';
        }
        
        return answer;
    }
}