import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[] sorted;    // 정렬을 위한 임시 배열
    static int result = -1; // k번째에 저장되는 수 저장(횟수가 k보다 작으면 -1)
    static int count = 0;   // 누적 저장 횟수
    static int k;           // 입력 받는 저장 횟수

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        sorted = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        merge_sort(arr, 0, n - 1);
        System.out.println(result);
    }

    static void merge_sort(int[] arr, int left, int right) {
        if (left == right) return;

        int mid = (left + right) / 2;

        merge_sort(arr, left, mid);
        merge_sort(arr, mid + 1, right);

        merge(arr, left, mid, right);
    }

    static void merge(int[] arr, int left, int mid, int right) {
        int l = left, idx = left;
        int r = mid + 1;

        /* 좌, 우의 부분 배열 중 하나의 배열을 다 비울때까지
         * 앞 원소부터 크기를 비교하며 정렬 수행 */
        while (l <= mid && r <= right) {
            if (arr[l] <= arr[r]) {
                sorted[idx++] = arr[l++];
            } else {
                sorted[idx++] = arr[r++];
            }
        }

        if (l > mid) {  // 왼쪽 배열을 먼저 채운 경우
            while (r <= right) {
                sorted[idx++] = arr[r++];
            }
        } else {        // 오른쪽 배열을 먼저 채운 경우
            while (l <= mid) {
                sorted[idx++] = arr[l++];
            }
        }

        for (int i = left; i <= right; i++) {
            count++;

            if (count == k) {       // k번째에 저장되는 수를 출력해야 함
                result = sorted[i];
                break;
            }
            arr[i] = sorted[i];
        }
    }
}