class Solution {
    public static int idx;
    
    public static int haveK(int i, int k){
        while(i > 0){
            if(i % 10 == k) idx++;
            i /= 10;
        }
        
        return idx;
    }
    
    public int solution(int i, int j, int k) {
        int answer = 0;
        
        for(int n = i; n <= j; n++){
            idx = 0;
            
            if(haveK(n,k) != 0){
                answer += idx;
            }
        }
        
        return answer;
    }
}