package Lec_47_September_16_Graphs;

public class cycleInUndirectedGraph {
    
    static int find(int i, int[] parent){
        if(parent[i] == i){
            return i;
        }
        // path compression
        parent[i] = find(parent[i], parent);
        return parent[i];
    }
    static boolean union(int i, int j, int[] parent, int[] rank){

        int irep = find(i, parent);
        int jrep = find(j, parent);

        if(irep == jrep){
            return false;
        }
        if(rank[irep] < rank[jrep]){
            parent[irep] = jrep;
        }
        else if(rank[irep] > rank[jrep]){
            parent[jrep] = irep;
        }
        else{
            parent[irep] = jrep;
            rank[jrep]++;
        }
        return true;
    }
    public static void main(String[] args) {
        
        int n = 5;
        int numEdges = 10;
        int[][] edges = new int[numEdges][2];

        int[] parent = new int[n];
        int[] rank = new int[n];

        for(int i=0 ; i<n ; i++){
            parent[i] = i;
        }

        for(int[] edge : edges){
            int i = edge[0], j = edge[1];
            if(!union(i, j, parent, rank)){
                System.out.println("Cycle in Graph Exists");
                break;
            }
        }
    }
}
