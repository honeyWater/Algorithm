class Solution {
    public boolean solution(int x) {
        int dividedNum = 0;
        int num = x; // 자릿수를 더하며 값이 바뀔 것을 방지
        
        while(num > 0){
            dividedNum += num % 10;
            num /= 10;
        }
        
        return x % dividedNum == 0 ? true : false;
    }
}