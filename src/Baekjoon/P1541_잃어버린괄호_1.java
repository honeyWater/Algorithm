package Baekjoon;

import java.util.Scanner;

public class P1541_잃어버린괄호_1 {
    static int answer = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] str = input.split("-");

        for (int i = 0; i < str.length; i++) {
            int temp = mySum(str[i]);
            if (i == 0)
                answer += temp; // 가장 앞에 있는 값만 더함
            else
                answer -= temp; // 뒷부분은 더했던 값들을 모두 뺌
        }
        System.out.println(answer);
    }

    static int mySum(String s) {
        int sum = 0;
        String[] temp = s.split("\\+");

        for (int i = 0; i < temp.length; i++) {
            sum += Integer.parseInt(temp[i]);
        }

        return sum;
    }
}
