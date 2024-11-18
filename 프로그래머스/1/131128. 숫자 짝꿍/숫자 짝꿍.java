import java.util.*;

class Solution {
    public String solution(String X, String Y) {
        // 결과를 저장할 StringBuilder
        StringBuilder sb = new StringBuilder();
        
        // 문자열에서 각 숫자의 빈도를 저장할 배열
        int[] x = new int[10];
        int[] y = new int[10];
        
        // X 문자열에서 각 숫자의 빈도를 세어 x 배열에 저장
        for (int i = 0; i < X.length(); i++) {
            x[X.charAt(i) - '0']++;
        }
        
        // Y 문자열에서 각 숫자의 빈도를 세어 y 배열에 저장
        for (int i = 0; i < Y.length(); i++) {
            y[Y.charAt(i) - '0']++;
        }
        
        // 9부터 0까지 숫자를 비교하여 공통으로 존재하는 숫자를 빈도수만큼 StringBuilder에 추가
        for (int i = 9; i >= 0; i--) {
            int count = Math.min(x[i], y[i]);
            for (int j = 0; j < count; j++) {
                sb.append(i);
            }
        }
        
        // 공통 숫자가 없다면 -1 반환
        if (sb.length() == 0) {
            return "-1";
        }
        // 결과가 0으로만 이루어져 있다면 0 반환
        else if (sb.charAt(0) == '0') {
            return "0";
        }
        
        return sb.toString();
    }
}