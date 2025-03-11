import java.util.*;

class Solution {
    
    static String[] userIds;
    static String[] bannedIds;
    static HashSet<HashSet<String>> result = new HashSet<>();
    
    public int solution(String[] user_id, String[] banned_id) {
        userIds = user_id;
        bannedIds = banned_id;
        
        recursion(new HashSet<>(), 0);
        
        return result.size();
    }
    
    void recursion(HashSet<String> set, int depth) {
        if (depth == bannedIds.length) {
            result.add(set);
            return;
        }
        
        for (int i = 0; i < userIds.length; i++) {
            if (set.contains(userIds[i])) {
                continue;
            }
            
            if (check(userIds[i], bannedIds[depth])) {
                set.add(userIds[i]);
                recursion(new HashSet<>(set), depth + 1);
                set.remove(userIds[i]);
            }
        }
    }
    
    boolean check(String userId, String bannedId) {
        if (userId.length() != bannedId.length()) {
            return false;
        }
        
        boolean isSame = true;
        for (int i = 0; i < userId.length(); i++) {
            // 동일 인덱스의 문자가 다르고 제재 아이디의 문자가 '*'도 아니라면 false 반환
            if (userId.charAt(i) != bannedId.charAt(i) && bannedId.charAt(i) != '*') {
                isSame = false;
                break;
            }
        }
        
        return isSame;
    }
}