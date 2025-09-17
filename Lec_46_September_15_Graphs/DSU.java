package Lec_46_September_15_Graphs;

public class DSU {

    static int find(int i, int[] parent){
        if(i == parent[i]){
            return i;
        }
        return find(parent[i], parent);
    }
    static void union(int i, int j, int[] parent){

        int irep = find(i, parent);
        int jrep = find(j, parent);

        if(irep == jrep){
            return;
        }
        parent[irep] = jrep;
    }
    public static void main(String[] args) {
        
        int n = 5;  // number od nodes
        int numEdges = 10;  // independent of no. of nodes

        int[][] edges = new int[numEdges][2];

        int[] parent = new int[n];
        for(int i=0 ; i<n ; i++){
            parent[i] = i;
        }

        for(int[] edge : edges){
            int i = edge[0], j=edge[1];
            union(i, j, parent);
        }
    }
}
