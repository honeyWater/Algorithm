import java.util.*;

class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        char[] ch = s.toCharArray();
        String lower = "";
        String upper = "";
        
        for (int i = 0; i < ch.length; i++){
            if (Character.isLowerCase(ch[i])) {
                lower += ch[i];
            } else {
                upper += ch[i];
            }
        }
        
        char[] lowerArr = lower.toCharArray();
        char[] upperArr = upper.toCharArray();
        Arrays.sort(lowerArr);
        Arrays.sort(upperArr);
        
        for (int i = lowerArr.length - 1; i >= 0; i--) {
            sb.append(lowerArr[i]);
        }
        for (int i = upperArr.length - 1; i >= 0; i--) {
            sb.append(upperArr[i]);
        }
        
        return sb.toString();
    }
}