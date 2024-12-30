class Solution {
    public int[] solution(int n) {
        int[] answer = new int[n * (n + 1) / 2]; // 배열의 크기는 등차수열의 합과 같음
        int[][] arr = new int[n][n];
        
        int x = -1, y = 0, num = 1;
        
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (i % 3 == 0) {
                    x++;
                } else if (i % 3 == 1) {
                    y++;
                } else if (i % 3 == 2) {
                    x--;
                    y--;
                }
                arr[x][y] = num++;
            }
        }
        
        int index = 0;
        // 숫자가 들어간 부분만 2차원 배열에서 순서대로 꺼내오면 됨
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == 0) break;
                
                answer[index++] = arr[i][j];
            }
        }
        
        return answer;
    }
}