import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Deque<Integer> q = new LinkedList<>();
        int n = Integer.parseInt(br.readLine());

        while (n-- != 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            switch (st.nextToken()) {
                case "push":
                    q.add(Integer.parseInt(st.nextToken()));
                    break;
                case "pop":
                    if (q.isEmpty()) {
                        sb.append(-1);
                    } else {
                        sb.append(q.remove());
                    }
                    sb.append('\n');
                    break;
                case "size":
                    sb.append(q.size()).append('\n');
                    break;
                case "empty":
                    if (q.isEmpty()) sb.append(1);
                    else sb.append(0);
                    sb.append('\n');
                    break;
                case "front":
                    if (q.isEmpty()) sb.append(-1);
                    else sb.append(q.peekFirst());
                    sb.append('\n');
                    break;
                case "back":
                    if (q.isEmpty()) sb.append(-1);
                    else sb.append(q.peekLast());
                    sb.append('\n');
                    break;
            }
        }
        System.out.println(sb);
    }
}