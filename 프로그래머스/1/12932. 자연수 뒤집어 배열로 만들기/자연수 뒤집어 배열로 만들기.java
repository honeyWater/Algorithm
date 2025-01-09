class Solution {
    public int[] solution(long n) {
        String str = String.valueOf(n);
        String[] strArr = str.split("");
        
        int strLen = str.length();
        int[] answer = new int[strLen];
        
        for (int i = 0; i < strLen; i++) {
            answer[i] = Integer.parseInt(strArr[strLen - i - 1]);
        }
        
        return answer;
    }
}