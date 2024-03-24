import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int[] arr;
    static int top = -1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine());
        arr = new int[k];
        int sum = 0;

        for (int i = 0; i < k; i++) {
            int input = Integer.parseInt(br.readLine());
            switch (input) {
                case 0:
                    arr[top--] = 0;
                    break;
                default:
                    arr[++top] = input;
                    break;
            }
        }

        for (int i = 0; i <= top; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
