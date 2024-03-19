class Solution {
    public int solution(int order) {
        int answer = 0;
        String str = order + "";
        
        for(int i=0; i < str.length(); i++){
            if(order % 10 == 3 || order % 10 == 6 || order % 10 == 9)
                answer++;
            order /= 10;
        }
        
        return answer;
    }
}