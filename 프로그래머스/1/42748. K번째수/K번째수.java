import java.util.*;

class Solution {
    public static void sort(int[] arr){
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = 0; j < arr.length - 1 - i; j++){
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    
    public int[] solution(int[] array, int[][] commands) {
        // 1. commands.length 만큼 반복문 돌린다.
        // 2. array의 commands[0]~commands[1] 범위 만큼 뽑아서 ArrayList에 삽입 후 정렬
        // 3. ArrayList의 commands[2]번째 숫자를 answer에 추가

        int[] answer = new int[commands.length];
        
        for (int i = 0; i < commands.length; i++) {
            
            // ArrayList<Integer> list = new ArrayList<>();
            int[] list = new int[commands[i][1] - commands[i][0] + 1];
            int index = 0;
            
            for (int j = commands[i][0] - 1; j <= commands[i][1] - 1; j++) {
                list[index++] = array[j];
            }
            
            sort(list);
            answer[i] = list[commands[i][2] - 1];
        }

        return answer;
    }
}