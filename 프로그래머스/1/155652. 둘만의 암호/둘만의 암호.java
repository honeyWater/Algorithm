class Solution {
    public String solution(String s, String skip, int index) {
        StringBuilder answer = new StringBuilder();
        
        // 문자열 s에서 꺼낸 문자를 다시 사용할 일 없으므로 바로 temp로 사용해도 가능
        for(char temp : s.toCharArray()){
            int idx = 0;
            
            // idx가 index가 될때까지 반복
            while (idx < index){
                temp = temp == 'z' ? 'a' : (char) (temp + 1);
                
                // temp가 skip문자가 아닐 때만 횟수 증가
                if(!skip.contains(String.valueOf(temp))){
                    idx += 1;
                }
            }
            answer.append(temp);
        }
        
        return answer.toString();
    }
}