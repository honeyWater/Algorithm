import java.util.*;

// 풀이 생각이 안나서 찾아봤었음..
class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        List<String> list = new ArrayList<>();
        
        for (int i = 0; i < strings.length; i++) {
            list.add(strings[i].charAt(n) + strings[i]);
        }
        
        Collections.sort(list);
        
        for (int i = 0; i < strings.length; i++) {
            answer[i] = list.get(i).substring(1);
        }
        
        return answer;
    }
}