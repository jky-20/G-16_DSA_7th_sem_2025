package Lec_55_September_30_DP;

public class knapsack_0_1 {
    // static int maxVal = 0;
    static int knapsack(int[] weight, int[] value, int i, int W, int[][] dp){

        if(i == weight.length){
            return 0;
        }
        if(dp[i][W] != -1){
            return dp[i][W];
        }
        // not pick
        int ans1 = knapsack(weight, value, i+1, W, dp);

        // pick
        int ans2 = 0;
        if(weight[i] <= W){
            ans2 = knapsack(weight, value, i+1, W - weight[i], dp) + value[i];
        }

        dp[i][W] = Math.max(ans1, ans2);
        return dp[i][W];

    }
    public static void main(String[] args) {
        // maxVal = 0;
    }
}
