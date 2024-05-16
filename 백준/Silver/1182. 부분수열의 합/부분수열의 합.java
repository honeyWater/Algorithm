import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[] arr;
    static int n, s, answer = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        s = Integer.parseInt(st.nextToken());
        arr = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // 처음에 0을 넘겨주므로 아무것도 선택하지 않으면
        // 부분수열의 합이 0이라고 계산되므로
        if (s == 0) answer--;

        dfs(0, 0);
        System.out.println(answer);
    }

    public static void dfs(int sum, int cnt) {
        if (cnt == n) {
            if (sum == s) answer++;
            return;
        }

        dfs(sum + arr[cnt], cnt + 1);
        dfs(sum, cnt + 1);
    }
}