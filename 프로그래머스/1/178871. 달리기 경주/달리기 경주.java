import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        // 연결리스트로 구현했더니 시간초과가 뜸
        // 배열 내 위치를 계속해서 저장할 수 있는 Map 생성
        // <선수명, 등수>
        Map<String, Integer> rankMap = new HashMap<>();
        for (int i = 0; i < players.length; i++) {
            rankMap.put(players[i], i);
        }

        for (String player : callings) {
            // 추월한 선수의 기존 등수
            int rank = rankMap.get(player);
            // 추월당한 선수의 이름 임시 저장
            String beforePlayer = players[rank - 1];

            // players 갱신
            players[rank - 1] = player;
            players[rank] = beforePlayer;

            // rankMap 갱신
            rankMap.put(player, rank - 1);
            rankMap.put(beforePlayer, rank);
        }

        return players;
    }
}