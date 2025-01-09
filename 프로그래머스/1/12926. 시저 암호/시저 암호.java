class Solution {
    public String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();
        char[] ch = s.toCharArray();
        
        for (int i = 0; i < s.length(); i++) {
            
            if (Character.isLowerCase(ch[i])) {
                ch[i] = (char)('a' + (ch[i] - 'a' + n) % 26);
            } else if (Character.isUpperCase(ch[i])) {
                ch[i] = (char)('A' + (ch[i] - 'A' + n) % 26);
            }
            sb.append(ch[i]);
        }
        
        return sb.toString();
    }
}