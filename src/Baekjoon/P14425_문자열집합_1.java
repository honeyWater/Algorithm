package Baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P14425_문자열집합_1 {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        String[] S = new String[N];
        int ans = 0;

        for (int i = 0; i < N; i++) {
            S[i] = br.readLine();
        }

        for (int i = 0; i < M; i++) {
            String check = br.readLine();

            for (int j = 0; j < N; j++) {
                if (S[j].equals(check)) ans++;
            }
        }

        System.out.println(ans);
    }
}