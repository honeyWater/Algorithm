package Baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class P14425_문자열집합_3 {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int ans = 0;

        HashSet<String> set = new HashSet<>();

        // N만큼의 문자열 저장
        for (int i = 0; i < N; i++) {
            set.add(br.readLine());
        }

        // 뒤의 M개의 문자열과 set을 비교
        for (int i = 0; i < M; i++) {
            ans = set.contains(br.readLine()) ? ans+1 : ans;
        }

        System.out.println(ans);
    }
}