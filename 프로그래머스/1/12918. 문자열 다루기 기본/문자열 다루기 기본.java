class Solution {
    public boolean solution(String s) {
        if (s.length() != 4 && s.length() != 6) return false;
        
        char[] chArr = s.toCharArray();
        
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isDigit(chArr[i])) {
                return false;
            }
        }
        
        return true;
    }
}