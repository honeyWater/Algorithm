import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> q = new LinkedList<>();  // 기존 대기열
        Stack<Integer> stack = new Stack<>();   // 추가 대기열
        int n = Integer.parseInt(br.readLine());
        int canEat = 1; // 현재 먹을수 있는 순번

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            q.offer(Integer.parseInt(st.nextToken()));
        }

        while (!q.isEmpty()) {
            // 대기열 앞 사람이 간식 받을 순번이라면
            if (q.peek() == canEat) {
                q.poll();
                canEat++;
            }
            // 추가 대기열 바깥에 있는 사람이 받을 순번이라면
            else if (!stack.isEmpty() && stack.peek() == canEat) {
                stack.pop();
                canEat++;
            }
            // 둘 다 아니면 기존 대기열에서 추가 대기열로 이동
            else {
                stack.push(q.poll());
            }
        }

        // 스택에 남은 사람들이 받을 수 있는지
        while (!stack.isEmpty()) {
            if (stack.pop() == canEat) {
                canEat++;
            } else {
                System.out.println("Sad");
                return;
            }
        }

        System.out.println("Nice");
    }
}