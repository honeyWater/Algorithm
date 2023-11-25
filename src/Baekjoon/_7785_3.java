package Baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class _7785_3 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        TreeSet<String> names = new TreeSet<>(Collections.reverseOrder());

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            String name = st.nextToken();

            if (st.nextToken().equals("enter")) {
                names.add(name);
            } else {
                names.remove(name);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (String s : names) {
            sb.append(s).append('\n');
        }

        System.out.print(sb);
    }
}
