import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] pi = new int[n];
        int total = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            pi[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(pi);

        int[] sum = new int[n];
        sum[0] = pi[0];
        total += pi[0];
        for (int i = 1; i < n; i++) {
            sum[i] = sum[i - 1] + pi[i];
            total += sum[i];
        }

        System.out.println(total);
        br.close();
    }
}
