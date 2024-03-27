class Solution {
    public String solution(String s) {
        String[] str = s.split(" ");
        int n, min, max;
        min = max = Integer.parseInt(str[0]);

        for (int i = 1; i < str.length; i++) {
            n = Integer.parseInt(str[i]);
            if (n < min) min = n;
            if (n > max) max = n;
        }

        return min + " " + max;
    }
}