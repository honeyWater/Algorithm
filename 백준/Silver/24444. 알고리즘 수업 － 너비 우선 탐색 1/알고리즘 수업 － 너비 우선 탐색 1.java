import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int cnt = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());

        int[] check = new int[n + 1];
        List<Integer>[] graph = new List[n + 1];

        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }

        // 연결리스트 생성
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int[] edge = {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
            graph[edge[0]].add(edge[1]);
            graph[edge[1]].add(edge[0]);
        }

        // 인접 정점을 오름차순으로 방문할 수 있도록
        for (int i = 0; i < n + 1; i++) {
            if (graph[i] != null) {
                Collections.sort(graph[i]);
            }
        }

        bfs(check, graph, r);

        for (int i = 1; i <= n; i++) {
            System.out.println(check[i]);
        }
    }

    static void bfs(int[] ch, List<Integer>[] graph, int v) {
        Queue<List<Integer>> q = new LinkedList<>();
        q.offer(graph[v]);
        ch[v] = ++cnt;

        while (!q.isEmpty()) {
            List<Integer> list = q.poll();

            for (int nv : list) {
                if (ch[nv] == 0) {
                    ch[nv] = ++cnt;
                    q.offer(graph[nv]);
                }
            }
        }
    }
}