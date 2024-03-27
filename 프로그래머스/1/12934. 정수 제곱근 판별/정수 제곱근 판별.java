class Solution {
    public long solution(long n) {
        double x = Math.sqrt(n);

        if (x % 1 == 0)
            return ((long)x + 1) * ((long)x + 1);
        else
            return -1;
    }
}