class Solution {
    public String solution(int[] food) {
        StringBuffer sb = new StringBuffer();
        
        for (int i = 1; i < food.length; i++) {
            for (int j = 0; j < food[i] / 2; j++) {
                sb.append(i);
            }
        }
        
        StringBuffer reversedSb = new StringBuffer(sb);
        sb.append(0);
        sb.append(reversedSb.reverse());
        
        return sb.toString();
    }
}