class Solution {
    public int solution(int n, int m, int[] section) {
        boolean[] emptyWall = new boolean[n+1];
        int answer = 0;
        
        for (int i = 0; i < section.length; i++) {
            emptyWall[section[i]] = true;
        }
        
        for (int i = 1; i <= n; i++) {
            // 칠해야 하는 벽이라면 (true 라면)
            if (emptyWall[i]) {
                for (int j = i; j < i + m; j++) {
                    if (j > n) break;
                    emptyWall[j] = false;
                }
                answer++;
            }
        }
        
        return answer;
    }
}