class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int[] student = new int[n + 2];
        int answer = n;
        
        // 두 반복문을 통해 여벌 체육복이 도난당한 경우도 해결
        for(int l : lost)
            student[l]--;
        for(int r : reserve)
            student[r]++;
        
        for(int i = 1; i <= n; i++){
           if(student[i] == -1){
               if (student[i - 1] == 1){
                   student[i - 1]--;
                   student[i]++;
               } else if (student[i + 1] == 1){
                   student[i + 1]--;
                   student[i]++;
               } else {
                   answer--;
               }
           } 
        }
        
        return answer;
    }
}