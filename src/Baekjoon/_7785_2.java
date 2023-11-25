package Baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class _7785_2 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        HashMap<String, String> map = new HashMap<>();
        StringTokenizer st;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            String name = st.nextToken();

            if (map.containsKey(name))
                map.remove(name);
            else
                map.put(name, st.nextToken());
        }

        ArrayList<String> list = new ArrayList<>(map.keySet());
        list.sort(Collections.reverseOrder());

        for (String l : list) {
            System.out.println(l);
        }
    }
}
