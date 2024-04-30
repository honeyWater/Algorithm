import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int[] visited = new int[100001];
    static Queue<Integer> q = new LinkedList<>();
    static int k;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());   // 수빈
        k = Integer.parseInt(st.nextToken());       // 동생

        int second = bfs(n);
        System.out.println(second);
    }

    private static int bfs(int first) {
        int now;
        q.add(first);
        visited[first] = 1; // 방문 위치 확인을 위해 처음 위치를 1초로 설정

        while (!q.isEmpty()) {
            now = q.poll();

            if (now == k) {
                return visited[now] - 1;    // 처음 1로 했으니 리턴시 -1
            }
            if (now - 1 >= 0 && visited[now - 1] == 0) {
                visited[now - 1] = visited[now] + 1;
                q.add(now - 1);
            }
            if (now + 1 <= 100000 && visited[now + 1] == 0) {
                visited[now + 1] = visited[now] + 1;
                q.add(now + 1);
            }
            if (2 * now <= 100000 && visited[2 * now] == 0) {
                visited[2 * now] = visited[now] + 1;
                q.add(2 * now);
            }
        }
        return 0;
    }
}