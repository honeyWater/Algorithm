class Solution {
    public int solution(String s) {
        boolean sign = true; // true -> +, false -> -
        int result = 0;
        
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            
            if(c == '-'){
                sign = false;
            } else if(c != '+'){
                result = result * 10 + (c - '0'); // 이전 result의 자릿수를 올리고
            }
        }
        
        return sign == true ? result : result * -1;
    }
}