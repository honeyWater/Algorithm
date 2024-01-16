package SWExpertAcademy;

import java.io.*;
import java.util.*;

// 테스트 케이스 전부 통과
public class _삼각김밥월드_1 {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int test_case = 1; test_case <= T; test_case++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int answer = 0;
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            // start를 큰 층에 있는 수로 고정, 출발 도착이 바뀌는 것은 문제에 영향 x
            if (end > start){
                int temp = start;
                start = end;
                end = temp;
            }

            // start, end 각각 층수 찾기 [층수, 해당 층 인덱스]
            int[] layerS = findLayer(start);
            int[] layerE = findLayer(end);
            int diffLayer = Math.abs(layerS[0] - layerE[0]); // 층수 차이

            // 1. 같은 층이면 답은 두 수의 차
            // 2. 다른 층인데, end의 인덱스가 한 번에 갈 수 있는 루트에 있는지
            // 3. 다른 층이고, 꺾어야 하는 경우 중 S의 인덱스가 클 때
            // 4. 다른 층이고, 꺾어야 하는 경우 중 S의 인덱스가 작을 때
            if (layerS[0] == layerE[0]) {
                answer = Math.abs(start - end);
            } else if(layerS[1] - diffLayer <= layerE[1] && layerE[1] <= layerS[1]){
                answer = diffLayer;
            } else if(layerS[1] > layerE[1]){
                answer = Math.abs(layerS[1] - layerE[1]);
            } else if(layerS[1] < layerE[1]){
                answer = Math.abs(layerS[1] - layerE[1]) + diffLayer;
            }

            System.out.println("#" + test_case + ' ' + answer);
        }
    }

    static int[] findLayer(int value) {
        int layer = 1;
        int index = 0;
        int n = 0; // 해당 층의 구역 개수

        for (int i = 1; i <= 10000; i++) {
            n++;

            if (i == value) {
                index = n;
                break;
            }

            if (n == layer) {
                n = 0;
                layer++;
            }
        }

        return new int[]{layer, index};
    }
}
