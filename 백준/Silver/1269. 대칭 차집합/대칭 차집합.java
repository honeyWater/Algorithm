import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int an = Integer.parseInt(st.nextToken());
        int bn = Integer.parseInt(st.nextToken());

        Set<Integer> diffSetA = new HashSet<>();
        Set<Integer> diffSetB = new HashSet<>();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < an; i++) {
            diffSetA.add(Integer.parseInt(st.nextToken()));
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < bn; i++) {
            int num = Integer.parseInt(st.nextToken());
            if (diffSetA.contains(num)) {
                diffSetA.remove(num);
            } else {
                diffSetB.add(num);
            }
        }

        System.out.println(diffSetA.size() + diffSetB.size());
    }
}