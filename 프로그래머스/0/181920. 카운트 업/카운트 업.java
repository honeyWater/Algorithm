class Solution {
    public int[] solution(int start_num, int end_num) {
        int diff = end_num - start_num;
        int[] answer = new int[diff + 1];
        
        for (int i = 0; i <= diff; i++) {
            answer[i] = start_num + i;
        }
        
        return answer;
    }
}