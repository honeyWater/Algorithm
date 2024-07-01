class Solution {
    public String solution(String cipher, int code) {
        String[] strArr = cipher.split("");
        StringBuilder sb = new StringBuilder();
        
        for (int i = code - 1; i < cipher.length(); i+=code){
            sb.append(strArr[i]);
        }
        
        return sb.toString();
    }
}