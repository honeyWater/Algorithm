package Baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class P7785_회사에있는사람_1 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        ArrayList<String> list = new ArrayList<>();
        StringTokenizer st;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            String name = st.nextToken();

            if (st.nextToken().equals("enter"))
                list.add(name);
            else
                list.remove(name);
        }

        list.sort(Collections.reverseOrder());

        for (String l : list) {
            System.out.println(l);
        }
    }
}
