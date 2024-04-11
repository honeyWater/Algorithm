import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int[] resultArr;
    static int result = -1;
    static int count = 0;
    static int k;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        quick_sort(arr, 0, n - 1);

        if (result == -1) {
            System.out.println(-1);
        } else {
            Arrays.sort(resultArr);
            System.out.println(resultArr[0] + " " + resultArr[1]);
        }
    }

    static void quick_sort(int[] arr, int lo, int hi) {
        if (lo >= hi) return;

        int pivot = partition(arr, lo, hi);

        quick_sort(arr, lo, pivot - 1);
        quick_sort(arr, pivot + 1, hi);
    }

    static int partition(int[] arr, int left, int right) {
        int x = arr[right];
        int i = left - 1;

        for (int j = left; j < right; j++) {
            if (arr[j] <= x) {
                if (++count == k) {
                    result = 0;
                    resultArr = new int[]{arr[++i], arr[j]};
                    break;
                }
                swap(arr, ++i, j);
            }
        }

        if (i + 1 != right) {
            if (++count == k) {
                result = 0;
                resultArr = new int[]{arr[i + 1], arr[right]};
            }
            swap(arr, i + 1, right);
        }

        return i + 1;
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}