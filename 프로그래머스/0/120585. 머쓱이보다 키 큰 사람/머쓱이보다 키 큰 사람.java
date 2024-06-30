class Solution {
    public int solution(int[] array, int height) {
        int answer = 0;
        
        for (int each : array){
            if (each > height) answer++;
        }
        
        return answer;
    }
}