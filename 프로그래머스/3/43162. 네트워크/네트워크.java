import java.util.*;

class Solution {
    Queue<Integer> q = new LinkedList<>();
    static boolean[] visited;
    
    public int solution(int n, int[][] computers) {
        visited = new boolean[n];
        int answer = 0;
        
        for(int i=0; i<n; i++){
            if(visited[i] == false){
                bfs(i, computers, n);
                answer++;
            }
        }
        
        return answer;
    }
    
    public void bfs(int i, int[][] computers, int n){
        q.offer(i);
        visited[i] = true;
        
        while(!q.isEmpty()){
            int x = q.poll();
            
            for(int nx=0; nx<n; nx++){
                if(visited[nx] == false && computers[x][nx] == 1){
                    visited[nx] = true;
                    q.offer(nx);
                }
            }
        }
    }
}