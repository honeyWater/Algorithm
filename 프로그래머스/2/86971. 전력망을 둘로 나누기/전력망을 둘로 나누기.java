import java.util.*;

class Solution {
    static int minDiff = Integer.MAX_VALUE; // 송전탑 개수 차이의 최솟값
    static int cnt; // 한 쪽 전력망에서의 송전탑 개수

    public static int solution(int n, int[][] wires) {
        int index = 0;  // 제거할 전선

        for (int i = 0; i < wires.length; i++) {
            boolean[] ch = new boolean[n + 1];
            List<Integer>[] graph = new List[n + 1];

            cnt = 0; // 매 턴 한 쪽 송전탑 개수 초기화

            for (int j = 1; j <= n; j++) {
                graph[j] = new ArrayList<>();
            }
            for (int j = 0; j < wires.length; j++) {
                if (j == index) continue; // index 위치의 전선은 제거

                graph[wires[j][0]].add(wires[j][1]);
                graph[wires[j][1]].add(wires[j][0]);
            }

            // 하나씩 전선 끊은채로 dfs 호출
            dfs(1, graph, ch);

            int grid1 = cnt;
            int grid2 = Math.abs(n - cnt);
            int diff = Math.abs(grid1 - grid2);
            if (diff < minDiff) minDiff = diff;

            index++; // 다음 전선
        }

        return minDiff;
    }

    static void dfs(int v, List<Integer>[] graph, boolean[] ch) {
        ch[v] = true;
        cnt++;

        for (int nv : graph[v]) {
            if (!ch[nv]) {
                dfs(nv, graph, ch);
            }
        }
    }
}