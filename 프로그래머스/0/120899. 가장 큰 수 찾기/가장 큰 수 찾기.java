import java.util.*;

class Solution {
    public int[] solution(int[] array) {
        int maxNum = Arrays.stream(array).max().getAsInt();
        int index = 0;
        
        for (int i = 0; i < array.length; i++) {
            if (array[i] == maxNum) index = i;
        }
        
        return new int[] {maxNum, index};
    }
}