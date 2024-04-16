import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        List<Character> list = new LinkedList<>();

        String str = br.readLine();
        int m = Integer.parseInt(br.readLine());

        for (int i = 0; i < str.length(); i++) {
            list.add(str.charAt(i));
        }

        // Iterator를 커서로 이용
        ListIterator<Character> iter = list.listIterator();
        while (iter.hasNext()) {
            iter.next();
        }

        for (int i = 0; i < m; i++) {
            str = br.readLine();
            switch (str.charAt(0)) {
                case 'L':
                    if (iter.hasPrevious()) iter.previous();
                    break;
                case 'D':
                    if (iter.hasNext()) iter.next();
                    break;
                case 'B':
                    if (iter.hasPrevious()) {
                        iter.previous();
                        iter.remove();
                    }
                    break;
                case 'P':
                    iter.add(str.charAt(2));
                    break;
                default:
                    break;
            }
        }

        for (char s : list) {
            sb.append(s);
        }

        System.out.println(sb);
    }
}