class Solution {
    public int[] solution(String[] wallpaper) {
        int lux = Integer.MAX_VALUE;
        int luy = Integer.MAX_VALUE;
        int rdx = Integer.MIN_VALUE;
        int rdy = Integer.MIN_VALUE;
        
        for (int i = 0; i < wallpaper.length; i++) {
            for (int j = 0; j < wallpaper[i].length(); j++) {
                if (wallpaper[i].charAt(j) == '#') {
                    lux = i < lux ? i : lux;
                    luy = j < luy ? j : luy;
                    rdx = i+1 > rdx ? i+1 : rdx;
                    rdy = j+1 > rdy ? j+1 : rdy;
                }
            }
        }
        
        return new int[]{lux, luy, rdx, rdy};
    }
}