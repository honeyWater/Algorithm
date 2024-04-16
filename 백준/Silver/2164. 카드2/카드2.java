import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new LinkedList<>();
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            list.add(i);
        }

        while (list.size() > 1) {
            list.remove(0);
            list.add(list.remove(0));
        }

        System.out.println(list.remove(0));
    }
}