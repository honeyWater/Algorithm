import java.util.*;

class Solution {
    private static int[] answer;
    
    public int[] solution(String[][] places) {
        answer = new int[places.length];
        
        for (int i = 0; i < places.length; i++) {
            answer[i] = checkDistance(places[i]);
        }
        
        return answer;
    }
    
    private static int checkDistance(String[] place) {
        List<int[]> placeList = new ArrayList<>();

        for (int i = 0; i < place.length; i++) {
            String temp = place[i];
            for (int j = 0; j < temp.length(); j++) {
                if (temp.charAt(j) == 'P') {
                    placeList.add(new int[]{i, j});
                }
            }
        }

        for (int i = 0; i < placeList.size(); i++) {
            int[] listA = placeList.get(i);
            
            for (int j = i + 1; j < placeList.size(); j++) {
                int[] listB = placeList.get(j);
                int manhattan = Math.abs(listA[0] - listB[0]) + Math.abs(listA[1] - listB[1]);

                if (manhattan > 2) {
                    continue;
                } else if (manhattan == 1) {
                    return 0;
                } else if (manhattan == 2) {
                    // 같은 행이나 열이면 그 사이에 파티션이 없으면 거리두기 X
                    if (listA[0] == listB[0]) {
                        if (place[listA[0]].charAt(Math.min(listA[1], listB[1]) + 1) == 'O') {
                            return 0;
                        }
                    } else if (listA[1] == listB[1]) {
                        if (place[Math.min(listA[0], listB[0]) + 1].charAt(listA[1]) == 'O') {
                            return 0;
                        }
                    }
                    // 대각인데, 다른 대각에 파티션이 없으면 거리두기 X
                    else {
                        if (place[listA[0]].charAt(listB[1]) == 'O' ||
                            place[listB[0]].charAt(listA[1]) == 'O') {
                            return 0;
                        }
                    }
                }
            }
        }

        return 1;
    }
}