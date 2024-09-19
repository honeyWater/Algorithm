import java.util.*;

class Solution {
    public List<Integer> solution(int[] numbers) {
        List<Integer> arr = new ArrayList<>();
        
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                int temp = numbers[i] + numbers[j];
                
                if (!arr.contains(temp)) {
                    arr.add(temp);
                }
            }
        }
        
        Collections.sort(arr);
        
        return arr;
    }
}