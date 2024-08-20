class Solution {
    public String solution(String s) {
        StringBuffer sb = new StringBuffer();
        int index = 0;
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                index = 0;
                sb.append(' ');
            } else if (index % 2 == 0) {
                index++;
                sb.append(Character.toUpperCase(s.charAt(i)));
            } else {
                index++;
                sb.append(Character.toLowerCase(s.charAt(i)));
            }
        }
        
        return sb.toString();
    }
}
// 주어진 문자열이 소문자만 주어진다는 보장 X
// 왜 7점이나 주지;