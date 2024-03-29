package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class P11724_연결요소의개수_1 {
    static ArrayList<Integer>[] arr;    // 인접 리스트
    static boolean[] visited;           // 방문 배열

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        arr = new ArrayList[n + 1];
        visited = new boolean[n + 1];

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

        int count = 0;
        for (int i = 1; i < n + 1; i++) {
            if (!visited[i]) {
                count++;
                dfs(i);
            }
        }

        System.out.println(count);
    }

    static void dfs(int v) {
        if (visited[v]) {
            return;
        }
        visited[v] = true; // 방문한 적이 없다면 true로

        for (int i : arr[v]) {
            if (!visited[i]) {    // 연결 노드 중 방문하지 않았던 노드만 탐색하기
                dfs(i);
            }
        }
    }
}
