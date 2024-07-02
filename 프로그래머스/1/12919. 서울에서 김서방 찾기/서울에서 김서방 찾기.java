class Solution {
    public String solution(String[] seoul) {
        StringBuilder answer = new StringBuilder("김서방은 ");
        
        for (int i = 0; i < seoul.length; i++) {
            if (seoul[i].equals("Kim")) {
                answer.append(i);
                break;
            }
        }
        
        return answer.append("에 있다").toString();
    }
}