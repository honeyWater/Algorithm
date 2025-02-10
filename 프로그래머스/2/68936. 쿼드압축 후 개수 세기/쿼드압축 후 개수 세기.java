class Solution {
    static int[] answer;
    
    public int[] solution(int[][] arr) {
        answer = new int[2];
        
        recursion(arr, arr.length, 0, 0);
        
        return answer;
    }
    
    // 배열, 배열 크기, 시작 좌표로 재귀
    private static void recursion(int[][] arr, int size, int x, int y) {
        // 압축에 실패해도 최종적으로 size=1 일 때의 0과 1의 개수에 맞게 더해짐
        if(compression(arr, size, x, y, arr[x][y])) {
            if (arr[x][y] == 1) answer[1]++;
            else answer[0]++;
            
            return;
        }
        
        recursion(arr, size / 2, x, y);                         // 좌측 상단
        recursion(arr, size / 2, x + size / 2, y);              // 우측 상단
        recursion(arr, size / 2, x, y + size / 2);              // 좌측 하단
        recursion(arr, size / 2, x + size / 2, y + size / 2);   // 우측 하단
    }
    
    // 압축 가능한지 검사 (처음 위치의 값과 다르면 false, 아니면 true)
    private static boolean compression(int[][] arr, int size, int x, int y, int value) {
        for (int i = x; i < x + size; i++) {
            for (int j = y; j < y + size; j++) {
                if (arr[i][j] != value) {
                    return false;
                }
            }
        }
        
        return true;
    }
}