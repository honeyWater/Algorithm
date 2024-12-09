import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        Map<String, List<String>> reportMap = new HashMap<>();
        Map<String, Integer> mailNum = new HashMap<>();
        int[] answer = new int[id_list.length];

        for (int i = 0; i < id_list.length; i++) {
            reportMap.put(id_list[i], new ArrayList<>());
            mailNum.put(id_list[i], 0);
        }

        for (String eachReport : report) {
            String[] both = eachReport.split(" ");

            if (!reportMap.get(both[1]).contains(both[0])) {
                reportMap.get(both[1]).add(both[0]);
            }
        }

        for (int i = 0; i < id_list.length; i++) {
            List<String> list = reportMap.get(id_list[i]);
            if (list.size() >= k) {
                for (int j = 0; j < list.size(); j++) {
                    String reporter = list.get(j);
                    mailNum.put(reporter, mailNum.get(reporter) + 1);
                }
            }
        }

        for (int i = 0; i < id_list.length; i++) {
            answer[i] = mailNum.get(id_list[i]);
        }

        return answer;
    }
}