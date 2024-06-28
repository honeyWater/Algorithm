class Solution {
    public int solution(long num) { // num이 연산을 하다보면 int형의 범위를 넘어가는 구간이 있다?
        if (num == 1) return 0;
        
        for (int i = 1; i <= 500; i++){
            if(num % 2 == 0){
                num /= 2;
            } else {
                num = 3 * num + 1;
            }
            System.out.println(num);
            if (num == 1) return i;
        }
        
        return -1;
    }
}