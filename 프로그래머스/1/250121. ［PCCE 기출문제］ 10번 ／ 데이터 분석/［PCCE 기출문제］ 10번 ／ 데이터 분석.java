import java.util.*;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        List<int[]> list = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>() {{
            put("code", 0);
            put("date", 1);
            put("maximum", 2);
            put("remain", 3);
        }};
        
        int standardInfo = map.get(ext);
        int standardValue = map.get(sort_by);
        
        for (int i = 0; i < data.length; i++) {
            if (data[i][standardInfo] < val_ext) {
                list.add(data[i]);
            }
        }
        
        list.sort(Comparator.comparing(x -> x[standardValue]));
        
        return list.toArray(int[][]::new);
    }
}