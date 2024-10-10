class Solution {
    static int[] month = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    
    public String solution(int a, int b) {
        int num = 0; // 1부터 금
        
        for (int i = 0; i < a - 1; i++) {
            num += month[i];
        }
        num += b;
        num %= 7;
        
        switch (num) {
            case 0:
                return "THU";
            case 1:
                return "FRI";
            case 2:
                return "SAT";
            case 3:
                return "SUN";
            case 4:
                return "MON";
            case 5:
                return "TUE";
            case 6:
                return "WED";
        }
        
        return "";
    }
}