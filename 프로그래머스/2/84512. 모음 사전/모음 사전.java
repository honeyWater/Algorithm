/*
1. 일단 모든 경우의 수는 5 + 25 + 125 + 625 + 3125 = 3905
    -> 자릿수에 따른 경우의 수
2. 여기서 각 알파벳으로 시작할 수 있는 단어는 각각 781개
    ex. a로 시작하는 단어는 781개
3. 그러므로 자릿수에 따라 781 / 156 / 31 / 6 / 1 이므로, 
주어진 word를 한글자씩 쪼개서 자릿수 별로 answer에 더해주면 됨
*/
class Solution {
    public int solution(String word) {
        int answer = 0;
        int per = 3905;
        
        for(String s : word.split(""))
            answer += "AEIOU".indexOf(s) * (per /= 5) + 1;
        
        return answer;
    }
}