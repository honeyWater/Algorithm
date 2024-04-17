import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int[] dx = {-1, 0, 1, 0}; // 북, 동, 남, 서
    static int[] dy = {0, 1, 0, -1};
    static int[][] area;
    static int cnt = 1;
    static int n, m, r, c, d;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        area = new int[n][m];

        st = new StringTokenizer(br.readLine(), " ");
        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        d = Integer.parseInt(st.nextToken());

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < m; j++) {
                area[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        simulation(r, c, d);
        System.out.println(cnt);
    }

    static void simulation(int x, int y, int dir) {
        area[x][y] = -1;  // 청소한 구역은 -1로 표시

        for (int i = 0; i < 4; i++) {
            dir = (dir + 3) % 4;    // 반시계 방향으로 90도 회전
            int nx = x + dx[dir];
            int ny = y + dy[dir];

            if (nx >= 0 && ny >= 0 && nx < n && ny < m) {
                if (area[nx][ny] == 0) {
                    cnt++;
                    simulation(nx, ny, dir);
                    return;
                }
            }
        }

        // 위에서 만족하지 못하면 후진
        int newDir = (dir + 2) % 4;
        int bx = x + dx[newDir];
        int by = y + dy[newDir];
        if (bx >= 0 && by >= 0 && bx < n && by < m && area[bx][by] != 1) {
            simulation(bx, by, dir);    // 바라보는 방향을 유지한 채로 후진..
        }
    }
}