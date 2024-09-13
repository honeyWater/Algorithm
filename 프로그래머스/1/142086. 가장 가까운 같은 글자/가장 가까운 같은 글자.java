class Solution {
    public int[] solution(String s) {
        int len = s.length();
        int[] answer = new int[len];
        int[] alphaPos = new int[26];
        
        for(int i = 0; i < 26; i++)
            alphaPos[i] = -1;
        
        for(int i = 0; i < len; i++){
            int pos = s.charAt(i) - 97;
            
            if(alphaPos[pos] == -1){
                answer[i] = -1;
            } else {
                answer[i] = i - alphaPos[pos];
            }
            
            alphaPos[pos] = i;
        }
        
        return answer;
    }
}
// 알파벳 위치 체크 배열 선언 후 -1로 초기화
// 값이 -1이면 answer[i] = -1, 아니면 (현재 위치 - 해당 위치)
// 현재 위치로 업데이트, alphaPos[pos] = i 