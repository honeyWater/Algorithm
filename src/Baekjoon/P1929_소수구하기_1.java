package Baekjoon;

import java.util.Scanner;

public class P1929_소수구하기_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        int[] arr = new int[N + 1];
        for (int i = 2; i <= N; i++) {
            arr[i] = i;
        }

        for (int i = 2; i <= Math.sqrt(N); i++) {  // 제곱근까지만 수행
            if (arr[i] == 0) {
                continue;
            }

            for (int j = i + i; j <= N; j = j + i) {    // 배수 지우기
                arr[j] = 0;
            }
        }

        for (int i = M; i <= N; i++) {
            if (arr[i] != 0) {
                System.out.println(arr[i]);
            }
        }
    }
}
