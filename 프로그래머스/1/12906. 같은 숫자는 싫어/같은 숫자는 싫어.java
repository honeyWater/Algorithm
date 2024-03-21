import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] result = new int[arr.length];
        int index = 0;
        result[index++] = arr[0];
        
        for(int i=1; i<arr.length;i++){
            if(arr[i] != arr[i-1])
                result[index++] = arr[i];
        }
        
        int[] answer = new int[index];
        for(int i=0; i<index;i++){
            answer[i] = result[i];
        }

        return answer;
    }
}