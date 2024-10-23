class Solution {
    public int solution(String[] babbling) {
        String[] available = {"aya", "ye", "woo", "ma"};
        String[] notAvailable = {"ayaaya", "yeye", "woowoo", "mama"};
        int answer = 0;
        
        for (int i = 0; i < babbling.length; i++) {
            // 불가능한 연속 발음 -> 0
            for (String not : notAvailable) {
                if (babbling[i].contains(not)) {
                    babbling[i] += "0";
                }
            }
            
            // 가능한 발음 -> 1
            for (int j = 0; j < available.length; j++) {
                babbling[i] = babbling[i].replace(available[j], "1");
            }
        }
        
        for (int i = 0; i < babbling.length; i++) {
            babbling[i] = babbling[i].replace("1", ""); // 가능했던 것 -> 공백처리
            if (babbling[i].equals("")) {
                answer++;
            }
        }
        
        return answer;
    }
}