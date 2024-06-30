class Solution {
    public int[] solution(int n) {
        int len = 0;
        
        if(n % 2 == 0){
            len = n / 2;
        } else {
            len = n / 2 + 1;
        }
        
        int[] answer = new int[len];
        answer[0] = 1;
        for (int i = 1; i < len; i++){
            answer[i] = answer[i - 1] + 2;
        }
        
        return answer;
    }
}