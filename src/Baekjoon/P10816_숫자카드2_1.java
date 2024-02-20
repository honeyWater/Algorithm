package Baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class P10816_숫자카드2_1 {

    static String num;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < N; i++) {
            num = st.nextToken();

            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < M; i++) {

            num = st.nextToken();

            if (map.containsKey(num)) {
                sb.append(map.get(num));
            } else {
                sb.append(0);
            }

            sb.append(' ');
        }

        System.out.println(sb);
    }
}
