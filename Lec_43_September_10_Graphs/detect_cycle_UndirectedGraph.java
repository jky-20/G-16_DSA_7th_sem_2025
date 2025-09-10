package Lec_43_September_10_Graphs;

public class detect_cycle_UndirectedGraph {

    static boolean DFS(int[][] grid, int n, int i, int callingNode, boolean[] v){

        if(v[i]){
            return true;
        }
        v[i] = true;

        for(int j=0 ; j<n ; j++){
            if(j == callingNode){
                continue;
            }
            if(grid[i][j] == 1){
                if(DFS(grid, n, j, i, v)){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        
    }
}
