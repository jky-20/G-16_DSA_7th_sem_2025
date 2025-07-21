package Lec_16_July_21_Baktracking;

public class rat_in_maze {
    boolean ratInMaze(int i, int j, int col, int row, int[][] maze){
        // base cases
        if(i >= row || j >= col || maze[i][j] == 1){
            return false;
        }
        // target case
        if(i == row-1 && j == col-1){
            return true;
        }

        // recursive calls
        boolean right = ratInMaze(i, j+1, col, row, maze);
        boolean bottom = ratInMaze(i+1, j, col, row, maze);

        // operations
        boolean ans = right | bottom;

        // return
        return ans;
    }
    int countPath(int i, int j, int col, int row, int[][] maze, int[][] dp){
        // base cases
        if(i >= row || j >= col || maze[i][j] == 1){
            return 0;
        }
        // target case
        if(i == row-1 && j == col-1){
            return 1;
        }
        // check memory
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        // recursive calls
        int right = countPath(i, j+1, col, row, maze, dp);
        int bottom = countPath(i+1, j, col, row, maze, dp);

        // operations
        int ans = right + bottom;

        // return
        return ans;
    }
    public static void main(String[] args) {
        
    }
}
