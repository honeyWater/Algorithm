import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Set<Integer> diffSetA = new HashSet<>();

        // 사이즈 입력 스킵
        br.readLine();

        // A요소 초기화
        for (String s : br.readLine().split(" ")) {
            diffSetA.add(Integer.parseInt(s));
        }

        // A요소가 B요소와 겹치면 제거, 안겹치면 B요소 수 증가
        int diffB = 0;
        for (String s : br.readLine().split(" ")){
            int num = Integer.parseInt(s);
            if (diffSetA.contains(num)) {
                diffSetA.remove(num);
            } else {
                diffB++;
            }
        }

        System.out.println(diffSetA.size() + diffB);
    }
}