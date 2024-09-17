class Solution {
    public int solution(int n, String control) {
        
        for (int i = 0; i < control.length(); i++) {
            char temp = control.charAt(i);
            if (temp == 'w') {
                n++;
            } else if (temp == 's') {
                n--;
            } else if (temp == 'd') {
                n += 10;
            } else {
                n -= 10;
            }
        }
        
        return n;
    }
}