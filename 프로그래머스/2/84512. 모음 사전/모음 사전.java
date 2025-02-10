/*
1. 모든 단어를 재귀를 통해 순서대로 리스트에 넣어 둔다.
2. word에 해당하는 단어의 순서를 찾아 반환한다.
*/
import java.util.*;

class Solution {
    static List<String> wordList;
    static String[] alpha = {"A", "E", "I", "O", "U"};
    
    public int solution(String word) {
        wordList = new ArrayList<>();
        int answer = 0;
        
        // 완전탐색 시작
        recursion("", 0);
        
        // word의 순서 찾기
        for (int i = 0; i < wordList.size(); i++) {
            if (wordList.get(i).equals(word)) {
                answer = i;
                break;
            }
        }
        
        return answer;
    }
    
    static void recursion(String str, int len) {
        wordList.add(str);
        
        if (len == 5) return;
        
        for (int i = 0; i < alpha.length; i++) {
            recursion(str + alpha[i], len + 1);
        }
    }
}