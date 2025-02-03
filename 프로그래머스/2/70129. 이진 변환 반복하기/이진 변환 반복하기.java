/*
1. s가 "1"이 될 때까지 while문을 돌린다.
2. 기존의 문자열 길이를 저장
3. 0을 제거
4. 제거한 0의 개수 증가, answer[1] += (2번 - 0 제거 후 길이)
5. 0을 제거한 문자열의 길이를 이진 변환
6. 위 과정 수행 후 이진 변화 횟수(answer[0]) 증가
*/

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        
        while (!s.equals("1")) {
            // 기존의 문자열 길이 저장
            int beforeLen = s.length();
            
            // 0 제거 후, 제거한 문자열의 길이 저장
            s = s.replaceAll("0", "");
            int afterLen = s.length();
            
            // 제거한 0의 개수 증가
            answer[1] += (beforeLen - afterLen);
            
            // 0 제거 후, 해당 문자열 길이 이진 변환 및 변환 횟수(answer[0]) 증가
            s = Integer.toBinaryString(afterLen);
            answer[0]++;
        }
        
        return answer;
    }
}