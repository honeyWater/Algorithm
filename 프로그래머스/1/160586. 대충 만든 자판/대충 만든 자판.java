class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        
        for (int i = 0; i < targets.length; i++) {
            for (char c : targets[i].toCharArray()) {
                int minIdx = Integer.MAX_VALUE;
                
                // 각 문자가 keymap 문자열 중 몇 번째 있는지 확인하여 최소값 변경
                for (String key : keymap) {
                    int idx = key.indexOf(c);
                    
                    if (idx > -1 && idx < minIdx) {
                        minIdx = idx;
                    }
                }
                
                // min값도 변화했고, 같은 target 내에서 이미 -1 판정이 없어야 함
                if (minIdx < Integer.MAX_VALUE && answer[i] != -1) {
                    answer[i] += minIdx + 1; // 횟수는 인덱싱 + 1
                } else {
                    answer[i] = -1;
                }
            }
        }
        
        return answer;
    }
}