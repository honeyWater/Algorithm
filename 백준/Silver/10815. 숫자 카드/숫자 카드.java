import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        Set<Integer> cards = new HashSet<>();

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            cards.add(sc.nextInt());
        }

        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            if (cards.contains(sc.nextInt())) {
                sb.append(1 + " ");
            } else {
                sb.append(0 + " ");
            }
        }

        System.out.print(sb);
    }
}