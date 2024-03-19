class Solution {
    public static int factorial(int i){
        int num = 1;
        
        for(int j = i; j > 0; j--){
            num *= j;
        }
        
        return num;
    }
    
    public int solution(int n) {
        int answer = n;
        
        for(int i = 10; i > 0; i--){
            if(factorial(i) <= n){
                answer = i;
                break;
            }
        }
        
        return answer;
    }
}