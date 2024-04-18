import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        int a1 = sc.nextInt();
        int a0 = sc.nextInt();
        int c = sc.nextInt();
        int n0 = sc.nextInt();

        for (int n = n0; n <= 100; n++) {
            if (a1 * n + a0 > c * n) {
                flag = false;
                break;
            }
        }

        if (flag) System.out.println(1);
        else System.out.println(0);
    }
}