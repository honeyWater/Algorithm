import java.util.*;

class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        Map<Integer, Integer> attackMap = new HashMap<>();
        int lastAttack = attacks[attacks.length - 1][0]; // 마지막 공격의 시간
        int maxHealth = health;
        int healCnt = 0;
        
        for (int i = 0; i < attacks.length; i++) {
            attackMap.put(attacks[i][0], attacks[i][1]);
        }
        
        for (int i = 1; i <= lastAttack; i++) {
            if (attackMap.containsKey(i)) {
                health -= attackMap.get(i);
                healCnt = 0;
            } else {
                health += bandage[1]; // 초당 회복량 회복
                healCnt += 1; // 연속 성공 횟수 추가
            }
            
            if (health <= 0) {
                return -1;
            } else if (healCnt == bandage[0]) {
                health += bandage[2];
                healCnt = 0;
            }
            
            // 최대 체력 이상의 체력을 가지게 된다면
            if (health > maxHealth) {
                health = maxHealth;
            }
        }
        
        return health;
    }
}