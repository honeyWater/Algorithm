package programmers;

import java.util.Arrays;

public class _아이스아메리카노 {
    public static void main(String[] args) {
        int[] answer1 = solution(5500);
        int[] answer2 = solution(15000);

        System.out.println(Arrays.toString(answer1));
        System.out.println(Arrays.toString(answer2));
    }

    static int[] solution(int money){
        int[] answer = new int[2];
        int americano = 5500;

        answer[0] = money / americano;
        answer[1] = money % americano;

        return answer;
    }
}
