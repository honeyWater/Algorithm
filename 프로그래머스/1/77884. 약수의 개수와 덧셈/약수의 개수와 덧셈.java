class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        
        for(int i = left; i <= right; i++){
            int cnt = 0;
            
            for(int j = 1; j <= i / 2; j++){
                if(i % j == 0)
                    cnt++;
            }
            
            // 자기 자신은 항상 약수 이므로 ++cnt
            if(++cnt % 2 == 0){
                answer += i;
            } else {
                answer -= i;
            }
        }
        
        return answer;
    }
}