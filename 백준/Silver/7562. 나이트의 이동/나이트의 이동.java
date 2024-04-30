import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int[][] chess;
    static int[] dr = {-1, -2, -2, -1, 1, 2, 2, 1};
    static int[] dc = {-2, -1, 1, 2, 2, 1, -1, -2};
    static int[] goal, result;
    static int i;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        result = new int[T];
        String[] str;

        for (int x = 0; x < T; x++) {
            i = Integer.parseInt(br.readLine());
            chess = new int[i][i];

            str = br.readLine().split(" ");
            int[] knight = new int[]{Integer.parseInt(str[0]), Integer.parseInt(str[1])};
            chess[knight[0]][knight[1]] = 1;

            str = br.readLine().split(" ");
            goal = new int[]{Integer.parseInt(str[0]), Integer.parseInt(str[1])};

            bfs(knight[0], knight[1]);
            sb.append(chess[goal[0]][goal[1]] - 1).append('\n');
        }
        System.out.println(sb);
    }

    private static void bfs(int r, int c) {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{r, c});

        while (!q.isEmpty()) {
            int[] current = q.poll();
            int cr = current[0];
            int cc = current[1];

            for (int x = 0; x < 8; x++) {
                int nr = cr + dr[x];
                int nc = cc + dc[x];

                if (nr >= 0 && nc >= 0 && nr < i && nc < i && chess[nr][nc] == 0) {
                    chess[nr][nc] = chess[cr][cc] + 1;
                    q.add(new int[]{nr, nc});
                }
            }
        }
    }
}