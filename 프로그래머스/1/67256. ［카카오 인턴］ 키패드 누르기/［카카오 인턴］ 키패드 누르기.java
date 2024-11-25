import java.util.*;

class Solution {
    
    // 초기 손가락 위치 * 와 #
    static int[] nowL = {3, 0};
    static int[] nowR = {3, 2};
    static boolean isRightHanded; // 오른손잡이 기준으로 true, false
    static HashMap<Integer, int[]> numberPositions;
    
    public String solution(int[] numbers, String hand) {
        StringBuilder sb = new StringBuilder();
        
        numberPositions = generatePositions();
        isRightHanded = hand.equals("right");
        
        // 각 번호에 대한 손 위치 결정
        for (int number : numbers) {
            int[] pos = numberPositions.get(number);
            
            // 지금 누르려는 손 결정
            String touch = handleTouch(pos);
            
            // 해당 손 위치 업데이트
            if (touch.equals("R")) {
                nowR = pos;
            } else {
                nowL = pos;
            }
            
            sb.append(touch);
        }
        
        return sb.toString();
    }
    
    private static String handleTouch(int[] pos) {
        if (pos[1] == 0) return "L"; // 왼쪽 열이면 "L"
        else if (pos[1] == 2) return "R"; // 오른쪽 열이면 "R"
        
        if (calculateDistance(pos)) return "R";
        else return "L";
    }
    
    private static boolean calculateDistance(int[] pos) {
        int distanceL = Math.abs(pos[0] - nowL[0]) + Math.abs(pos[1] - nowL[1]);
        int distanceR = Math.abs(pos[0] - nowR[0]) + Math.abs(pos[1] - nowR[1]);
        
        if (distanceL > distanceR) return true;
        else if (distanceL < distanceR) return false;
        
        return isRightHanded; // 거리가 같은 경우는 손잡이로
    }
    
    private static HashMap<Integer, int[]> generatePositions() {
        int[][] numbers = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9},
            {-1, 0, -1}
        };
        
        HashMap<Integer, int[]> eachPosition = new HashMap<>();
        
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                int key = numbers[i][j];
                int[] value = {i, j};
                
                if (key != -1) {
                    eachPosition.put(key, value);
                }
            }
        }
        
        return eachPosition;
    }
}