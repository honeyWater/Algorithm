import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static Queue<int[]> q = new LinkedList<>();
    static int[] heightDir = {0, 0, 0, 0, 1, -1};
    static int[] rowDir = {-1, 0, 1, 0, 0, 0};
    static int[] colDir = {0, 1, 0, -1, 0, 0};
    static int[][][] tomato;
    static int h, r, c;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        c = Integer.parseInt(st.nextToken());   // M
        r = Integer.parseInt(st.nextToken());   // N
        h = Integer.parseInt(st.nextToken());   // H
        tomato = new int[h][r][c];  // 층, 행, 열

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < r; j++) {
                st = new StringTokenizer(br.readLine());
                for (int k = 0; k < c; k++) {
                    tomato[i][j][k] = Integer.parseInt(st.nextToken());
                    if (tomato[i][j][k] == 1) q.add(new int[]{i, j, k});
                }
            }
        }

        System.out.println(bfs());
    }

    private static int bfs() {
        while (!q.isEmpty()) {
            int[] current = q.poll();
            int ch = current[0];
            int cr = current[1];
            int cc = current[2];

            for (int i = 0; i < 6; i++) {
                int nh = ch + heightDir[i];
                int nr = cr + rowDir[i];
                int nc = cc + colDir[i];

                // 6방향으로 토마토가 익을 수 있는지 확인
                if (nh < 0 || nh >= h || nr < 0 || nr >= r || nc < 0 || nc >= c) continue;
                if (tomato[nh][nr][nc] != 0) continue;

                q.add(new int[]{nh, nr, nc});
                tomato[nh][nr][nc] = tomato[ch][cr][cc] + 1;
            }
        }

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < r; j++) {
                for (int k = 0; k < c; k++) {
                    // 익지 않은 토마토가 있다면 -1 반환
                    if (tomato[i][j][k] == 0) return -1;

                    max = Math.max(max, tomato[i][j][k]);
                }
            }
        }

        if (max == 1) return 0;  // 원래 다 익어있었다면
        else return max - 1;    // 첫 시작이 1이므로 -1
    }
}