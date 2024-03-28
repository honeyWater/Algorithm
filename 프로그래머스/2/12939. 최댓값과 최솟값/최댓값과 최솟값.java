import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String[] str = s.split(" ");
        int[] num = Arrays.stream(str).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(num);
        
        StringBuilder answer = new StringBuilder();
        answer.append(num[0]).append(" ").append(num[str.length - 1]);
        return answer.toString();
    }
}