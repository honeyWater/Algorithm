package Baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class P28278_스택2_2 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine()); // 명령어의 수
        Stack<Integer> stack = new Stack<>();
        StringTokenizer st;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");

            switch (st.nextToken()) {
                case "1" : stack.push(Integer.parseInt(st.nextToken())); break;
                case "2" : sb.append(stack.isEmpty() ? -1 : stack.pop()).append("\n"); break;
                case "3" : sb.append(stack.size()).append("\n"); break;
                case "4" : sb.append(stack.isEmpty() ? 1 : 0).append("\n"); break;
                case "5" : sb.append(stack.isEmpty() ? -1 : stack.peek()).append("\n"); break;
                default: break;
            }
        }

        br.close();
        System.out.println(sb);
    }
}
