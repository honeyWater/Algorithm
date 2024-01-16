package SWExpertAcademy;

import java.util.*;
import java.io.*;

// 테스트 케이스 중 3분의1만 통과함
public class _AI의반란최후의전쟁 {
    static boolean[] active;    // 갤럭시 가동 가능 유무, 전부 true일 때
    static int sum;             // 소멸되는 능력치의 합
    static ArrayList<Integer> common;

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int test_case = 1; test_case <= T; test_case++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            common = new ArrayList<>();
            int[][] ability = new int[n][3];
            active = new boolean[3];
            sum = 0;

            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine());
                ability[i][0] = Integer.parseInt(st.nextToken());
                ability[i][1] = Integer.parseInt(st.nextToken());
                ability[i][2] = Integer.parseInt(st.nextToken());
                compare(ability[i]);
            }

            if(!active[0] && common.size() > 0){
                sum += common.remove(0) * 2;
                active[0] = true;
            }
            if(!active[1] && common.size() > 0){
                sum += common.remove(0) * 2;
                active[1] = true;
            }
            if(!active[2] && common.size() > 0){
                sum += common.remove(0) * 2;
                active[2] = true;
            }

            for (int c : common) {
                sum += c * 2;
            }

            if (!active[0] || !active[1] || !active[2]) {
                System.out.println("#" + test_case + " " + -1);
            } else {
                System.out.println("#" + test_case + " " + sum);
            }
        }
    }

    static void compare(int[] values) {
        int a = values[0];
        int b = values[1];
        int c = values[2];

        if (a == b && b == c) {  // a,b,c 가 같은 수 이면, ArrayList에 담아둔 후 처리
            common.add(a);
        } else if (a > b && a > c) {         // a가 최대일 때
            sum += b + c;
            active[0] = true;
        } else if (b > a && b > c) {     // b가 최대일 때
            sum += a + c;
            active[1] = true;
        } else {                 // c가 최대일 때
            sum += a + b;
            active[2] = true;
        }
    }
}
