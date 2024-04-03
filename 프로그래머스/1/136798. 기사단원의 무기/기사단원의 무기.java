class Solution {
    public int solution(int number, int limit, int power) {
        int[] divisorCnt = new int[number + 1];
        int answer = 0;
        
        for(int i=1; i <= number; i++){
            int n = divisor(i);
            divisorCnt[i] = n <= limit ? n : power;
            answer += divisorCnt[i];
        }
        
        return answer;
    }
    
    public static int divisor(int number){
        int count = 0;
        
        for(int i = 1; i * i <= number; i++){
            if(i*i == number) count++;
            else if(number % i == 0) count += 2;
        }
        
        return count;
    }
}