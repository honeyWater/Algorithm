class Solution {
    public int[] solution(int n, int[] numlist) {
        int[] temp = new int[numlist.length];
        int index = 0;
        
        for (int i = 0; i < numlist.length; i++) {
            if (numlist[i] % n == 0) {
                temp[index++] = numlist[i];
            }
        }
        
        int[] answer = new int[index];
        for (int i = 0; i < index; i++) {
            answer[i] = temp[i];
        }
        
        return answer;
    }
}