package ExampleClass3;

public class DPKnapSack {
    private final int C;
    private final int[] profit;
    private final int[] weights;


    public DPKnapSack(int C, int[] profit, int[] weights) {
        this.C = C;
        this.profit = profit;
        this.weights = weights;
    }

    public int P() {
        int i=0; int w =0;
        int n = weights.length;
        if(C==0 || n == 0) return 0;

        int[][] dp = new int[n+1][C+1];

        for(i=0; i<=n; i++) {
            for(w=0; w<=C; w++) {
                if(i==0 || w==0) dp[i][w] = 0;
                else if(weights[i-1] <=w) {
                    dp[i][w] = Math.max(profit[i-1] + dp[i][w-weights[i-1]],dp[i-1][w]);

                }
                else {
                    dp[i][w] = dp[i-1][w];
                }
            }
        }
        return dp[n][C];
    }
}
