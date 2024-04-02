import java.util.*;

class Solution {
    public int solution(int[] ingredient) {
        Stack<Integer> st = new Stack<>();
        int answer = 0;
        
        for(int i : ingredient){
            st.push(i);
            int n = st.size();
            
            if(n >= 4){
                if(st.get(n - 1) == 1 && st.get(n - 2) == 3 && st.get(n - 3) == 2 && st.get(n - 4) == 1){
                    answer++;
                    st.pop();
                    st.pop();
                    st.pop();
                    st.pop();
                }
            }
        }
        
        return answer;
    }
}