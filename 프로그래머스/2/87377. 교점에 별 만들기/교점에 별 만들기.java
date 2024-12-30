import java.util.*;

/*
1. 주어직 수식을 이용해 정수인 교점을 구한다.
    (이 때, A, B, C는 -100,000~100,000 이므로 곱연산 시 int형 범위를 넘어가므로 long 사용)
2. 구한 교점 중 최소 사각형으로 반환해야 하므로 x,y 각각의 최소, 최대값을 구한다.
3. 최대, 최소값을 이용해 '*'을 알맞은 위치에 배치되도록
*/

class Solution {
    
    private static long minX = Long.MAX_VALUE, minY = Long.MAX_VALUE;
    private static long maxX = Long.MIN_VALUE, maxY = Long.MIN_VALUE;
    
    private class Point {
        public final long x, y;
        
        private Point (long x, long y) {
            this.x = x;
            this.y = y;
        }
    }
    
    public String[] solution(int[][] line) {
        Set<Point> points = new HashSet<>();
        
        // 정수인 교점과 각 좌표 중 x, y의 최대 최솟값 구하기
        for (int i = 0; i < line.length; i++) {
            for (int j = i + 1; j < line.length; j++) {
                long a = line[i][0], b = line[i][1], e = line[i][2];
                long c = line[j][0], d = line[j][1], f = line[j][2];
                
                long adbc = a * d - b * c;
                if (adbc == 0) continue; // 평행 혹은 일치
                
                long bfed = b * f - e * d;
                if (bfed % adbc != 0) continue; // x != 정수
                
                long ecaf = e * c - a * f;
                if (ecaf % adbc != 0) continue; // y != 정수
                
                long x = bfed / adbc;
                long y = ecaf / adbc;
                points.add(new Point(x, y));
                
                minX = Math.min(minX, x);
                minY = Math.min(minY, y);
                maxX = Math.max(maxX, x);
                maxY = Math.max(maxY, y);
            }
        }
        
        int height = (int) (maxY - minY + 1);
        int width = (int) (maxX - minX + 1);
        
        String[] answer = new String[height];
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < width; i++) {
            sb.append(".");
        }
        Arrays.fill(answer, sb.toString());
        
        for (Point p : points) {
            int y = (int) (maxY - p.y);
            int x = (int) (p.x - minX);
            answer[y] = answer[y].substring(0, x) + "*" + answer[y].substring(x+1);
        }
        
        return answer;
    }
}