class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        
        while(!(n < a)){
            answer += (n / a) * b;
            n = (n / a) * b + (n % a);
        }
        
        return answer;
    }
}
// while(!(n < a))
// 받는 것을 answer에 덧셈
// 결국 n / a 만큼 받은 후, 남은 n % a 와 더함을 반복 ?
