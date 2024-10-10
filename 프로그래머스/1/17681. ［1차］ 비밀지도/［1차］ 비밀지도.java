// 이미 풀어져있길래 봤는데, 그 당시에 못풀겠어서 답을 찾아봤던 모양..
class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        
        for(int i=0; i<n; i++){
            String str = Integer.toBinaryString(arr1[i] | arr2[i]);
            
            str = String.format("%" + n + "s", str);
            str = str.replaceAll("1", "#");
            str = str.replaceAll("0", " ");
            
            answer[i] = str;
        }
        
        return answer;
    }
}