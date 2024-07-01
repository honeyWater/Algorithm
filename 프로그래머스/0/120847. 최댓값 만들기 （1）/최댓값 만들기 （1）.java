import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        Integer[] numArr = Arrays.stream(numbers).boxed().toArray(Integer[]::new);
        Arrays.sort(numArr, Collections.reverseOrder());
        
        return numArr[0] * numArr[1];
    }
}