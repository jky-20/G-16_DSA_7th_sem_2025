package Lec_42_September_08_Graphs;

import java.util.ArrayDeque;


public class graph {

    static void DFS(int[][] grid, int s, int n, boolean [] visited){
        
        if(visited[s]){
            return;
        }
        System.out.print(s + " -> ");
        visited[s] = true;
        for(int i=0 ; i<n ; i++){
            if(grid[s][i] == 1){
                DFS(grid, i, n, visited);
            }
        }
    }
    static void BFS(int[][] grid, int s, int n, boolean[] visited){

        ArrayDeque<Integer> queue = new ArrayDeque<>();
        queue.add(s);
        visited[s] = true;

        while(!queue.isEmpty()){
            int node = queue.poll();
            System.out.println(node + " -> ");

            // push every adjacent nodes of node in queue
            for(int i=0 ; i<n ; i++){
                if(!visited[i] && grid[node][i] == 1){
                    queue.add(i);
                    visited[i] = true;
                }
            }
        }
    }
    public static void main(String[] args) {
        
    }
}
