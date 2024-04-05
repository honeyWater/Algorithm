import java.util.*;

class Solution {
    static Queue<Integer> q = new LinkedList<>();
    static boolean[] visit;
    
    public int solution(int n, int[][] computers) {
        visit = new boolean[n];
        int answer = 0;
        
        for(int i=0; i<n; i++){
            if(visit[i] == false){
                bfs(i, computers, n);
                answer++;
            }
        }
        
        return answer;
    }
    
    public void bfs(int i, int[][] computers, int n){
        q.offer(i);
        visit[i] = true;
        
        while(!q.isEmpty()){
            int x = q.remove();
            
            for(int nx=0; nx<n; nx++){
                if(visit[nx] == false && computers[x][nx] == 1){
                    visit[nx] = true;
                    q.add(nx);
                }
            }
        }
    }
}