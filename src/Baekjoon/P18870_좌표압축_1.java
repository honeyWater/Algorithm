package Baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class P18870_좌표압축_1 {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        ArrayList<Integer> arr = new ArrayList<>();
        int[] newArr = new int[N];
        int num = 0;

        for (int i = 0; i < N; i++) {
            arr.add(Integer.parseInt(st.nextToken()));
        }

        for (int i = 0; i < N; i++) {
            int min = Collections.min(arr);
            int idx = arr.indexOf(min);

            arr.set(arr.indexOf(min), (int) Math.pow(10, 9)); // 인덱싱 변화없도록 최대값으로 만듬
            newArr[idx] = num;

            if (min != Collections.min(arr)) {
                num++;
            }
        }

        for(int i=0; i<N;i++){
            sb.append(newArr[i]).append(" ");
        }

        System.out.println(sb);
    }
}
