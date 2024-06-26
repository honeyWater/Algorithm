class Solution {
    static int[] dx = {-1, 0, 1, 1, 1, 0, -1, -1, 0};  // 왼쪽 대각선 부터 시계방향 + 지뢰 자리
    static int[] dy = {1, 1, 1, 0, -1, -1, -1, 0, 0};

    public int solution(int[][] board) {
        int answer = 0;
        int n = board.length;
        boolean[][] newBoard = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 1) {
                    for (int k = 0; k < 9; k++) {
                        int nx = i + dx[k];
                        int ny = j + dy[k];
                        if (nx >= 0 && nx < n && ny >= 0 && ny < n) {
                            newBoard[nx][ny] = true;
                        }
                    }
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (!newBoard[i][j]) answer++;
            }
        }

        return answer;
    }
}