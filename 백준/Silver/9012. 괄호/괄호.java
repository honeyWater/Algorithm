import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    static Stack<Character> st;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            st = new Stack<>();
            String ps = br.readLine();

            for (int j = 0; j < ps.length(); j++) {
                char c = ps.charAt(j);
                if (!st.isEmpty() && st.peek() == '(' && c == ')') {
                    st.pop();
                } else {
                    st.push(c);
                }
            }

            if (st.isEmpty())
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}