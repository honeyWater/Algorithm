class Solution {
    static boolean isPrime(int num){
        for(int i = 2; i <= (int)Math.sqrt(num); i++){
            if(num % i == 0)
                return false;
        }
        
        return true;
    }
    
    public int solution(int n) {
        int answer = 1; // 2는 소수
        
        for(int num = 3; num <= n; num += 2){
            if(isPrime(num))
                answer++;
        }
        
        return answer;
    }
}