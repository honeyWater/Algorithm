class Solution {
    public int solution(int[] num_list) {
        String oddNum = "";
        String evenNum = "";
        
        for (int n : num_list) {
            if (n % 2 == 0) {
                evenNum += n;
            } else {
                oddNum += n;
            }
        }
        
        return Integer.parseInt(oddNum) + Integer.parseInt(evenNum);
    }
}