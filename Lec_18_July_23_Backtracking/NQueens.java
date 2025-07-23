package Lec_18_July_23_Backtracking;

import java.util.ArrayList;
import java.util.List;

public class NQueens {
    List<String> convertToList(int[][] board, int n){

        List<String> ans = new ArrayList<>();

        for(int i=0 ; i<n ; i++){
            StringBuilder sb = new StringBuilder();
            for(int j=0 ; j<n ; j++){
                if(board[i][j] == 1){
                    sb.append('Q');
                }
                else{
                    sb.append('.');
                }
            }
            ans.add(sb.toString());
        }
        return ans;
    }
    boolean isValid(int i, int j, int n, int[][] board){
        
        // check column
        for(int row = 0 ; row < i ; row++){
            if(board[row][j] == 1){
                return false;
            }
        }

        // check diagonals
        for(int x=i-1, y=j-1 ; x>=0 && y>=0 ; x--, y--){
            if(board[x][y] == 1){
                return false;
            }
        }
        for(int x=i-1, y=j+1 ; x>=0 && y<n ; x--, y++){
            if(board[x][y] == 1){
                return false;
            }
        }
        return true;
    }
    void solveNQueens(int n , int i, int[][] board, List<List<String>> ans){
        // base case
        if(i == n){
            ans.add(convertToList(board, n));
            return;
        }

        for(int j=0 ; j<n ; j++){
            if(isValid(i,j,n, board)){
                board[i][j] = 1;
                solveNQueens(n, i+1, board, ans);
                board[i][j] = 0;
            }
        }
    }
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        solveNQueens(n, 0, new int[n][n], ans);
        return ans;
    }
    public static void main(String[] args) {
        
    }
}
