import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int max = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        // 오름차순 정렬했으므로 맨 뒤 값이 가장 큰 값
        for (int i = n - 3; i >= 0; i--) {
            if (arr[i] + arr[i + 1] > arr[i + 2]) {
                System.out.println(arr[i] + arr[i + 1] + arr[i + 2]);
                return;
            }
        }

        System.out.println(-1);
    }
}