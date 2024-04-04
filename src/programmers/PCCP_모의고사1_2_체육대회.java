package programmers;

public class PCCP_모의고사1_2_체육대회 {

    static int n, m;        // 학생 수, 종목 수
    static boolean[] check; // 학생 확인
    static int answer;

    public static void main(String[] args) {
        int[][] ability1 = {
                {40, 10, 10},
                {20, 5, 0},
                {30, 30, 30},
                {70, 0, 70},
                {100, 100, 100}
        };

        int[][] ability2 = {
                {20, 30},
                {30, 20},
                {20, 30}
        };

        System.out.println(solution(ability1));
        System.out.println(solution(ability2));
    }

    public static int solution(int[][] ability) {
        n = ability.length;
        m = ability[0].length;
        check = new boolean[n];
        answer = 0;

        dfs(0, 0, ability);

        return answer;
    }

    public static void dfs(int L, int sum, int[][] ability) {
        if (L == m) {
            answer = Math.max(answer, sum);
        } else {
            for (int i = 0; i < n; i++) {
                if (!check[i]) {
                    check[i] = true;
                    dfs(L + 1, sum + ability[i][L], ability);
                    check[i] = false;
                }
            }
        }
    }
}
