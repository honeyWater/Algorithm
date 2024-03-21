import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        char[][] ch = new char[5][15];
        int max = 0;

        for (int i = 0; i < 5; i++) {
            String str = sc.nextLine();

            if (max < str.length())
                max = str.length();

            for (int j = 0; j < str.length(); j++) {
                ch[i][j] = str.charAt(j);
            }
        }

        for (int i = 0; i < max; i++) {
            for (int j = 0; j < 5; j++) {
                if (ch[j][i] == '\0')
                    continue;
                sb.append(ch[j][i]);
            }
        }
        System.out.println(sb);
    }
}
