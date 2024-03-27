import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String[] str = s.split(" ");
        int[] num = Arrays.stream(str).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(num);
        
        return num[0] + " " + num[str.length - 1];
    }
}