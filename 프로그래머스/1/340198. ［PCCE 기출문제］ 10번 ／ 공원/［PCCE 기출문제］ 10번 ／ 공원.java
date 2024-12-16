import java.util.*;

class Solution {
    public int solution(int[] mats, String[][] park) {
        int answer = -1;
        
        // 돗자리 내림차순 정렬
        Integer[] matss = Arrays.stream(mats).boxed().toArray(Integer[]::new);
        Arrays.sort(matss, Collections.reverseOrder());
        
        // 공원에 각 돗자리별로 놓을 수 있는지 확인
        for (int mat : matss) {
            for (int i = 0; i <= park.length - mat; i++) {
                for (int j = 0; j <= park[0].length - mat; j++) {
                    boolean check = true;
                    
                    // 돗자리를 놓을 수 있는지 확인
                    if (park[i][j].equals("-1") && i + mat <= park.length && j + mat <= park[0].length) {
                        for (int k = 0; k < mat; k++) {
                            for (int l = 0; l < mat; l++) {
                                if (!park[i+k][j+l].equals("-1")) {
                                    check = false;
                                    break;
                                }
                            }
                            
                            if (!check) break;
                        }
                        
                        if (check) { // 설치 가능할 경우 최대 크기이므로 바로 반환
                            return mat;
                        }
                    }
                }
            }
        }
        
        return answer;
    }
}