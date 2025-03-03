// 1. brown과 yellow를 더한 값 = 넓이
// 2. 넓이의 가로 길이는 세로 길이와 같거나, 세로 길이보다 길다.
// 3. 중앙 노란색의 넓이는 가로-2 * 세로-2
// 4. yellow, brown이 최솟값일 때, 가로 세로는 최소 3

class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int area = brown + yellow;

        for(int y = 3; y < area; y++){  // x, y 둘 다 최소 3
            int x = area / y;
            
            if(area % y == 0 && x >= y){
                int center = (x - 2) * (y - 2);

                // 노란색이 가운데 들어갈 수 있는지
                if(center == yellow){
                    answer[0] = x;
                    answer[1] = y;
                    break;
                }
            }
        }

        return answer;
    }
}