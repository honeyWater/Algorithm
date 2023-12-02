package Baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.StringTokenizer;

public class _1764_1 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashSet<String> people = new HashSet<>();
        ArrayList<String> noHearSee = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            people.add(br.readLine());
        }

        for (int i = 0; i < M; i++) {
            String noSee = br.readLine();
            if (people.contains(noSee)) {
                noHearSee.add(noSee);
            }
        }
        Collections.sort(noHearSee);

        StringBuilder sb = new StringBuilder();

        sb.append(noHearSee.size()).append('\n');
        for (String s : noHearSee) {
            sb.append(s).append('\n');
        }

        System.out.print(sb);
    }
}
