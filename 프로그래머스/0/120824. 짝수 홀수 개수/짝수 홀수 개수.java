class Solution {
    public int[] solution(int[] num_list) {
        int isOdd = 0;
        int isEven = 0;
        
        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] % 2 == 0) {
                isEven++;
            } else {
                isOdd++;
            }
        }
        
        return new int[] {isEven, isOdd};
    }
}