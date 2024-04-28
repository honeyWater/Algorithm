import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static List<Integer> result = new ArrayList<>();
    static boolean[][] check;
    static int[][] danji;
    static int[] dr = {-1, 0, 1, 0};
    static int[] dc = {0, 1, 0, -1};
    static int cnt, n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        check = new boolean[n][n];
        danji = new int[n][n];
        cnt = 1;    // 기준 아파트를 포함하고 시작

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            for (int j = 0; j < n; j++) {
                danji[i][j] = str.charAt(j) - '0';
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (danji[i][j] == 1 && !check[i][j]) {
                    dfs(i, j);
                    result.add(cnt);
                    cnt = 1;    // 단지를 돌고 카운팅 초기화
                }
            }
        }

        Collections.sort(result);
        System.out.println(result.size());
        for (int i : result) {
            System.out.println(i);
        }
    }

    public static void dfs(int r, int c) {
        check[r][c] = true;

        for (int i = 0; i < 4; i++) {
            int nr = dr[i] + r;
            int nc = dc[i] + c;

            if (nr >= 0 && nc >= 0 && nr < n && nc < n && !check[nr][nc] && danji[nr][nc] == 1) {
                cnt++;
                dfs(nr, nc);
            }
        }
    }
}