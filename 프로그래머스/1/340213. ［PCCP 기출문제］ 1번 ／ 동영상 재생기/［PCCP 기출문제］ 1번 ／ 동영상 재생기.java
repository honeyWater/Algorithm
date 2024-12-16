class Solution {
    static int opStart;
    static int opEnd;
    
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        // 연산하기 쉽게 전부 초로 변환
        int videoStart = 0;
        int videoEnd = Integer.parseInt(video_len.substring(0, 2)) * 60 + Integer.parseInt(video_len.substring(3, 5));
        int now = Integer.parseInt(pos.substring(0, 2)) * 60 + Integer.parseInt(pos.substring(3, 5));
        opStart = Integer.parseInt(op_start.substring(0, 2)) * 60 + Integer.parseInt(op_start.substring(3, 5));
        opEnd = Integer.parseInt(op_end.substring(0, 2)) * 60 + Integer.parseInt(op_end.substring(3, 5));
        
        if (now >= opStart && now <= opEnd) {
            now = opEnd;
        }
        
        for (String c : commands) {
            if (c.equals("prev")) {
                int prev = now - 10;
                
                // 10초 전이 오프닝 시간이라면
                if (inOpening(prev)) {
                    now = opEnd;
                }
                // 10초 전이 0초 이하가 되면
                else if (prev < 0) {
                    now = 0;
                    // 0초도 오프닝 시간이라면
                    if (inOpening(now)) {
                        now = opEnd;
                    }
                }
                // 둘 다 아니면
                else {
                    now = prev;
                }
            } else if (c.equals("next")) {
                int next = now + 10;
                
                if (inOpening(next)) {
                    now = opEnd;
                } else if (next > videoEnd) {
                    now = videoEnd;
                } else {
                    now = next;
                }
            }
        }
        
        String minute = String.format("%2s", String.valueOf(now/60)).replace(" ", "0");
        String second = String.format("%2s", String.valueOf(now%60)).replace(" ", "0");
        return minute + ":" + second;
    }
    
    // 현재 재생 위치가 오프닝 구간인지 확인
    private boolean inOpening(int second) {
        if (second >= opStart && second <= opEnd) return true;
        return false;
    }
}