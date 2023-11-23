package Baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class _18870_2 {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] origin = new int[N]; // 원본 배열
        int[] sorted = new int[N]; // 정렬 할 배열
        HashMap<Integer, Integer> map = new HashMap<>();

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            sorted[i] = origin[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(sorted);

        // 정렬 된 배열을 순회하면서 map에 넣어준다.
        int rank = 0;
        for (int s : sorted) {
            /**
             * 앞선 원소가 이미 순위가 매겨졌다면, 중복되지 않을 때만
             * map에 원소와 그에 대응되는 순위를 넣어준다.
             */
            if (!map.containsKey(s)) {
                map.put(s, rank);
                rank++;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int key : origin) {
            int ranking = map.get(key);
            sb.append(ranking).append(' ');
        }

        System.out.println(sb);
    }
}
