import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static int[] arr = new int[10000];
    public static int top = -1;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());

        for (int i = 0; i < n; i++) {
            String[] str = bf.readLine().split(" ");

            switch (str[0]) {
                case "push":
                    push(Integer.parseInt(str[1]));
                    break;
                case "pop":
                    pop();
                    break;
                case "size":
                    size();
                    break;
                case "empty":
                    empty();
                    break;
                case "top":
                    top();
                    break;
            }
        }

    }

    public static void push(int num) {
        arr[++top] = num;
    }

    public static void pop() {
        if (top == -1) {
            System.out.println(-1);
        } else {
            System.out.println(arr[top]);
            arr[top--] = 0;
        }
    }

    public static void size() {
        System.out.println(top + 1);
    }

    public static void empty() {
        if (top == -1)
            System.out.println(1);
        else
            System.out.println(0);
    }

    public static void top() {
        if (top == -1)
            System.out.println(-1);
        else
            System.out.println(arr[top]);
    }
}
