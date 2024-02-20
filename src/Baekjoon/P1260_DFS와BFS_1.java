package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class P1260_DFS와BFS_1 {
    static ArrayList<Integer>[] arr;    // 인접 리스트
    static boolean[] visited;           // 방문 배열

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());       // 정점의 개수
        int m = Integer.parseInt(st.nextToken());       // 간선의 개수
        int start = Integer.parseInt(st.nextToken());   // 시작점
        arr = new ArrayList[n + 1];

        for (int i = 0; i < n + 1; i++) {   // 인접 리스트 초기화
            arr[i] = new ArrayList<Integer>();
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            // 양방향 에지이므로 양쪽에 더하기
            arr[s].add(e);
            arr[e].add(s);
        }

        // 번호가 작은 것을 먼저 방문하기 위해 정렬하기
        for (int i = 1; i <= n; i++) {
            Collections.sort(arr[i]);
        }

        visited = new boolean[n + 1];
        dfs(start);
        System.out.println();
        visited = new boolean[n + 1];
        bfs(start);
    }

    static void dfs(int v) {
        System.out.print(v + " ");

        visited[v] = true; // 방문한 노드는 true로

        for (int i : arr[v]) {
            if (!visited[i]) {    // 연결 노드 중 방문하지 않았던 노드만 탐색하기
                dfs(i);
            }
        }
    }

    static void bfs(int v) {
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(v);
        visited[v] = true;

        while (!q.isEmpty()) {
            int now = q.poll();
            System.out.print(now + " ");

            for (int i : arr[now]) {
                if (!visited[i]) {
                    visited[i] = true;
                    q.add(i);
                }
            }
        }
    }
}
