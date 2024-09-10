class Solution {
    public String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();
        char[] chArr = s.toCharArray();
        
        for (int i = 0; i < s.length(); i++) {
            
            if (Character.isLowerCase(chArr[i])) {
                chArr[i] = (char) ('a' + (chArr[i] - 'a' + n) % 26);
            } else if (Character.isUpperCase(chArr[i])) {
                chArr[i] = (char) ('A' + (chArr[i] - 'A' + n) % 26);
            }
            sb.append(chArr[i]);
        }
        
        return sb.toString();
    }
}