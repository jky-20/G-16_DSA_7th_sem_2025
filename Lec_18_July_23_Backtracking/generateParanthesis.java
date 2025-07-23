package Lec_18_July_23_Backtracking;

import java.util.ArrayList;
import java.util.List;

public class generateParanthesis {
    void helper(int n, int open, int close, StringBuilder sb, List<String> ans){
        
        // base case
        if(open > n || close > open){
            return;
        }
        // Target case
        if(open == n && open == close){
            ans.add(sb.toString());
            return;
        }
        // operation and recursive call
        sb.append('(');
        helper(n, open + 1, close, sb, ans);

        // operation and other call
        sb.setCharAt(sb.length()-1, ')');
        helper(n, open, close+1, sb, ans);

        // return statement
        sb.deleteCharAt(sb.length()-1);
    }
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        helper(n, 0, 0, new StringBuilder(), ans);
        return ans;
    }
    public static void main(String[] args) {
        
    }
}
