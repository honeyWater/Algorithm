class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int direction = 0;  // 시계방향 : 0,1,2,3 - 우,하,좌,상
        int value = 1;      // 넣을 값
        int row = 0;
        int col = 0;

        while (value <= n * n) {
            answer[row][col] = value++;

            // 현재 위치에 따른 방향 전환
            if (direction == 0) {           // 오른쪽으로 이동
                if (col == n - 1 || answer[row][col + 1] != 0) {
                    direction = 1;
                    row++;
                } else {
                    col++;
                }
            } else if (direction == 1) {    // 아래쪽으로 이동
                if (row == n - 1 || answer[row + 1][col] != 0) {
                    direction = 2;
                    col--;
                } else {
                    row++;
                }
            } else if (direction == 2) {    // 왼쪽으로 이동
                if (col == 0 || answer[row][col - 1] != 0) {
                    direction = 3;
                    row--;
                } else {
                    col--;
                }
            } else if (direction == 3) {    // 위쪽으로 이동
                if (row == 0 || answer[row - 1][col] != 0) {
                    direction = 0;
                    col++;
                } else {
                    row--;
                }
            }
        }

        return answer;
    }
}