import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int cnt = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int computerNum = Integer.parseInt(br.readLine());  // 컴퓨터의 수 (정점)
        int line = Integer.parseInt(br.readLine());         // 연결되어 있는 컴퓨터 쌍의 수 (간선)

        boolean[] check = new boolean[computerNum + 1];     // 방문 확인
        List<Integer>[] graph = new List[computerNum + 1];  // 정점 수 만큼의 리스트

        for (int i = 1; i <= computerNum; i++) {
            graph[i] = new ArrayList<>();
        }

        StringTokenizer st;
        for (int i = 0; i < line; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int[] e = {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
            graph[e[0]].add(e[1]);
            graph[e[1]].add(e[0]);
        }

        bfs(check, graph, 1);
        System.out.println(cnt - 1);    // 1번 컴퓨터를 제외한 바이러스에 걸리는 컴퓨터의 수
    }

    public static void bfs(boolean[] check, List<Integer>[] graph, int v) {
        check[v] = true;
        cnt++;

        for (int nv : graph[v]) {
            if (!check[nv]) {
                bfs(check, graph, nv);
            }
        }
    }
}