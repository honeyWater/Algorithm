class Solution {
    boolean solution(String s) {
        s = s.toUpperCase();
        int count = 0;
        
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            
            if(c == 'P') count++;
            else if(c == 'Y') count--;
        }

        return count == 0 ? true : false;
    }
}