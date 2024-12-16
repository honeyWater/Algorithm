import java.util.*;

class Solution {
    public int solution(String[] friends, String[] gifts) {
        
        Map<String, Map<String, Integer>> sent = new HashMap<>(); // 보낸 사람이 누구에게 몇개를 주는지
        Map<String, Integer> giftIndex = new HashMap<>(); // 선물지수
        Map<String, Integer> predict = new HashMap<>(); // 예측
        
        // 데이터 전처리
        for (String gift : gifts) {
            String[] parts = gift.split(" ");
            String giver = parts[0];
            String receiver = parts[1];
            
            sent.putIfAbsent(giver, new HashMap<>());
            Map<String, Integer> giverMap = sent.get(giver);
            giverMap.put(receiver, giverMap.getOrDefault(receiver, 0) + 1);
        }
        
        // 선물지수 계산
        for (String friend : friends) {
            
            // 준 선물
            int giveNum = sent.getOrDefault(friend, new HashMap<>())
                .values()
                .stream()
                .mapToInt(Integer::intValue)
                .sum();
            
            // 받은 선물
            int receiveNum = sent.values()
                .stream()
                .mapToInt(hash -> hash.getOrDefault(friend, 0))
                .sum();
            
            // 계산
            giftIndex.put(friend, giveNum - receiveNum);
        }
        
        // 다음달 선물 받을 사람 예측
        for (int i = 0; i < friends.length; i++) {
            for (int j = i + 1; j < friends.length; j++) {
                
                String A = friends[i];
                String B = friends[j];
                
                int AtoB = sent.getOrDefault(A, new HashMap<>())
                    .getOrDefault(B, 0);
                
                int BtoA = sent.getOrDefault(B, new HashMap<>())
                    .getOrDefault(A, 0);
                
                // 선물 받게될 사람을 선정
                String bigVal = null;
                
                // 선물 주고 받은 개수가 같다면
                if (AtoB == BtoA) {
                    int indexA = giftIndex.getOrDefault(A, 0);
                    int indexB = giftIndex.getOrDefault(B, 0);
                    if (indexA != indexB)
                        bigVal = indexA > indexB ? A : B;
                } else {
                    // 주고 받지 않았어도, 선물 지수에 따라서
                    bigVal = AtoB > BtoA ? A : B;
                }
                
                if (bigVal != null) {
                    predict.put(bigVal, predict.getOrDefault(bigVal, 0) + 1);
                }
            }
        }
        
        return predict.values().stream()
            .mapToInt(Integer::intValue)
            .max()
            .orElse(0);
    }
}