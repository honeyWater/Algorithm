import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        List<Integer> destroyNum = new ArrayList<>();
        int[] todayDate = new int[3];
        int[] eachDate = new int[3];
        String eachTerm = "";
        
        todayDate[0] = Integer.valueOf(today.substring(0, 4));
        todayDate[1] = Integer.valueOf(today.substring(5, 7));
        todayDate[2] = Integer.valueOf(today.substring(8, 10));
        
        for (int i = 0; i < privacies.length; i++) {
            eachDate[0] = Integer.valueOf(privacies[i].substring(0, 4));
            eachDate[1] = Integer.valueOf(privacies[i].substring(5, 7));
            eachDate[2] = Integer.valueOf(privacies[i].substring(8, 10));
            eachTerm += privacies[i].charAt(11);
            
            for (int j = 0; j < terms.length; j++) {
                if (eachTerm.equals(terms[j].charAt(0) + "")) {
                    eachDate[1] += Integer.valueOf(terms[j].substring(2, terms[j].length()));
                    
                    // 개월을 더하고 12월을 넘어가면
                    if (eachDate[1] > 12) {
                        eachDate[0] += eachDate[1] / 12;
                        eachDate[1] = eachDate[1] % 12;
                    }
                    
                    // 월이 0이 되버렸다면
                    if (eachDate[1] == 0) {
                        eachDate[0]--;
                        eachDate[1] = 12;
                    }
                    
                    if (eachDate[0] == todayDate[0]) {
                        if (eachDate[1] == todayDate[1]) {
                            if (eachDate[2] <= todayDate[2]) {
                                destroyNum.add(i+1);
                            }
                        } else if (eachDate[1] < todayDate[1]) {
                            destroyNum.add(i+1);
                        }
                    } else if (eachDate[0] < todayDate[0]) {
                        destroyNum.add(i+1);
                    }
                }
            }
            
            eachTerm = "";
        }
        
        return destroyNum.stream().mapToInt(Integer::intValue).toArray();
    }
}