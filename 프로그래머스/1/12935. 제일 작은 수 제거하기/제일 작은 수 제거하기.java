import java.util.*;

class Solution {
    public ArrayList<Integer> solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        if (arr.length == 1){
            list.add(-1);
            return list;
        }
        
        int min = Arrays.stream(arr).min().getAsInt();
        
        
        for (int num : arr){
            if (num != min){
                list.add(num);
            }
        }
        
        return list;
    }
}