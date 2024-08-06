class Solution {
    public int[] solution(int n, int m) {
        int min = Math.min(n, m);
        int maxSame = 1;
        
        for (int i = 2; i <= min; i++) {
            if (n % i == 0 && m % i == 0) {
                maxSame = i;
            }
        }
        
        int minSame = n * m / maxSame;
        
        return new int[]{maxSame, minSame};
    }
}