/*
1. 단위는 최대 절반 크기까지 검사
2. 단위만큼 자른 것과 그 다음 것이 같다면 반복횟수 증가 / 다르면 반복횟수+단위문자열
3. 마지막 남는 문자열에 대한 처리도 필요
4. 이런식으로 각 단위에서의 문자열 최소 길이를 구한다.
*/

import java.util.*;

class Solution {
    public int solution(String s) {
        int sLen = s.length();
        int answer = sLen;

        for (int i = 1; i <= sLen / 2 + 1; i++) {
            int compLen = compression(s, i, sLen);
            answer = Math.min(answer, compLen);
        }

        return answer;
    }
    
    private int compression(String s, int n, int len) {
        StringBuilder sb = new StringBuilder();
        String cut = s.substring(0, n);
        String now = "";
        int repeat = 0;
        
        for (int i = 0; i < len; i = i + n) {
            // 마지막 문자가 남았을 때, 문자열 길이를 초과하면 문자열 길이까지만 자른다.
            if (i + n > len) {
                now = s.substring(i, len);
            } else {
                now = s.substring(i, i + n);
            }
            
            // 현재 문자와 같으면, 반복 횟수 증가
            if (cut.equals(now)) {
                repeat++;
            }
            // 다르면, 2개 이상이면 숫자와 합치고 / 1개면 문자만 추가
            else {
                if (repeat > 1) {
                    sb.append(repeat + cut);
                } else {
                    sb.append(cut);
                }
                
                cut = now;
                repeat = 1;
            }
        }
        
        // 마지막 문자 처리
        if (repeat > 1) {
            sb.append(repeat + cut);
        } else {
            sb.append(cut);
        }
        
        return sb.length();
    }
}