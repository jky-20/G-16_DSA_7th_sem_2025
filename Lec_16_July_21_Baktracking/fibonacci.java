package Lec_16_July_21_Baktracking;

public class fibonacci {

    int NthTerm(int n, int[] dp){
        // base case
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        // check memory
        if(dp[n] != -1){
            return dp[n];
        }

        // recursive calls
        int track1 = NthTerm(n-1, dp);
        int track2 = NthTerm(n-2, dp);

        // operation
        int ans = track1 + track2;
        dp[n] = ans;

        // return statement
        return ans;
    }
    public static void main(String[] args){

    }
}
