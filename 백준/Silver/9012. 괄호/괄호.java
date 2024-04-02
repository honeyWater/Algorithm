import java.util.*;

public class Main {
    static Stack<Character> st;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            st = new Stack<>();
            String ps = sc.next();

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