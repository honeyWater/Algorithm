package Baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _1037_1 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        while(num-- > 0){
            int A = Integer.parseInt(st.nextToken());
            max = Math.max(A, max);
            min = Math.min(A, min);
        }

        System.out.println(max * min);
    }
}
