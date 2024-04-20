import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Map<String, Integer> nameKey = new HashMap<>();
        Map<Integer, String> numberKey = new HashMap<>();
        String s;
        for (int i = 1; i <= n; i++) {
            s = br.readLine();
            nameKey.put(s, i);
            numberKey.put(i, s);
        }

        for (int i = 0; i < m; i++) {
            s = br.readLine();
            if (s.charAt(0) >= 65 && s.charAt(0) <= 90) {
                sb.append(nameKey.get(s)).append('\n');
            } else {
                sb.append(numberKey.get(Integer.parseInt(s))).append('\n');
            }
        }
        System.out.println(sb);
    }
}