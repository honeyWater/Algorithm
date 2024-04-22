class Solution {
    static int[] dr = {-1, 0, 1, 0}; // N,E,S,W
    static int[] dc = {0, 1, 0, -1};
    static int cr, cc, rowLen, colLen;

    public static int[] solution(String[] park, String[] routes) {
        rowLen = park.length;
        colLen = park[0].length();

        // S의 인덱스 찾기
        for (int i = 0; i < rowLen; i++) {
            for (int j = 0; j < colLen; j++) {
                if (park[i].charAt(j) == 'S') {
                    cr = i;
                    cc = j;
                }
            }
        }

        for (String route : routes) {
            int num = route.charAt(2) - '0';
            move(route.charAt(0), num, park);
        }

        return new int[]{cr, cc};
    }

    public static void move(char direction, int num, String[] park) {
        int nr = 0, nc = 0;
        int currentR = cr;
        int currentC = cc;

        for (int i = 0; i < num; i++) {
            switch (direction) {
                case 'N':
                    nr = currentR + dr[0];
                    nc = currentC + dc[0];
                    break;
                case 'E':
                    nr = currentR + dr[1];
                    nc = currentC + dc[1];
                    break;
                case 'S':
                    nr = currentR + dr[2];
                    nc = currentC + dc[2];
                    break;
                case 'W':
                    nr = currentR + dr[3];
                    nc = currentC + dc[3];
                    break;
            }

            if (nr >= 0 && nr < rowLen && nc >= 0 && nc < colLen && park[nr].charAt(nc) != 'X') {
                currentR = nr;
                currentC = nc;
            } else {
                return;
            }
        }

        cr = nr;
        cc = nc;
    }
}