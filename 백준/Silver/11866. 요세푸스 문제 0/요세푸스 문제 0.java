import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        List<Integer> list = new LinkedList<>();
        List<Integer> Josephus = new ArrayList<>();
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int now = k - 1;

        for (int i = 1; i <= n; i++) {
            list.add(i);
        }

        while (!list.isEmpty()) {
            if (now >= list.size()) now = now % list.size();

            Josephus.add(list.remove(now));
            now += k - 1;
        }

        sb.append('<');
        for (int i = 0; i < Josephus.size() - 1; i++) {
            sb.append(Josephus.get(i)).append(", ");
        }
        sb.append(Josephus.get(Josephus.size() - 1)).append('>');
        System.out.println(sb);
    }
}