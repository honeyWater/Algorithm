import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        Deque<Integer> deque = new LinkedList<>();
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            switch (st.nextToken()) {
                case "1":
                    deque.addFirst(Integer.parseInt(st.nextToken()));
                    break;
                case "2":
                    deque.add(Integer.parseInt(st.nextToken()));
                    break;
                case "3":
                    if (!deque.isEmpty()) {
                        sb.append(deque.removeFirst());
                    } else {
                        sb.append(-1);
                    }
                    sb.append('\n');
                    break;
                case "4":
                    if (!deque.isEmpty()) {
                        sb.append(deque.removeLast());
                    } else {
                        sb.append(-1);
                    }
                    sb.append('\n');
                    break;
                case "5":
                    sb.append(deque.size()).append('\n');
                    break;
                case "6":
                    if (deque.isEmpty()) {
                        sb.append(1);
                    } else {
                        sb.append(0);
                    }
                    sb.append('\n');
                    break;
                case "7":
                    if (!deque.isEmpty()) {
                        sb.append(deque.getFirst());
                    } else {
                        sb.append(-1);
                    }
                    sb.append('\n');
                    break;
                case "8":
                    if (!deque.isEmpty()) {
                        sb.append(deque.getLast());
                    } else {
                        sb.append(-1);
                    }
                    sb.append('\n');
                    break;
            }
        }
        System.out.println(sb);
    }
}