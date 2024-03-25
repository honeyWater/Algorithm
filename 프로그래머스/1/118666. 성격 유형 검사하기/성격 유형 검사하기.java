import java.util.ArrayList;

class Solution {
    public static char[] element = {'R', 'T', 'C', 'F', 'J', 'M', 'A', 'N'};
    public static int[] scores; // R T C F J M A N 순서의 점수
    
    public String solution(String[] survey, int[] choices) {
        ArrayList<Character> ch = new ArrayList<>();
        scores = new int[8];
        String answer = "";

        for (int i = 0; i < 8; i++) {
            ch.add(element[i]);
        }

        for (int i = 0; i < survey.length; i++) {
            int index1 = ch.indexOf(survey[i].charAt(0));
            int index2 = ch.indexOf(survey[i].charAt(1));

            if (choices[i] < 4) {
                scores[index1] += Math.abs(choices[i] - 4);
            } else {
                scores[index2] += Math.abs(choices[i] - 4);
            }
        }

        for (int i = 0; i < 8; i += 2) {
            if (scores[i] > scores[i + 1]) {
                answer += element[i];
            } else if (scores[i] < scores[i + 1]) {
                answer += element[i + 1];
            } else {
                if (element[i] < element[i + 1]) {
                    answer += element[i];
                } else {
                    answer += element[i + 1];
                }
            }
        }

        return answer;
    }
}
// R  T  C  F  J  M  A  N
// 0  3  1  0  0  2  1  1