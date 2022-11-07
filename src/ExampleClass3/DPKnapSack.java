package ExampleClass3;

public class DPKnapSack {
    private final int C;
    private final int[] profit;
    private final int[] weights;

    private int[] DPArray;

    public DPKnapSack(int C, int[] profit, int[] weights) {
        this.C = C;
        this.profit = profit;
        this.weights = weights;
    }

    public void printDPArray(int[][] dp) {
        StringBuilder sb  = new StringBuilder();
        sb.append("--------------------\n");
        for(int[] row : dp ) {
            for(int price : row) {
                sb.append("|").append(price).append("|");
            }
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }
    public void printDPArray() {
        StringBuilder sb =new StringBuilder();
        for(int profit: this.DPArray) {
            sb.append("|").append(profit).append("|");
        }
        System.out.println(sb.toString());
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
        //printDPArray(dp);
        return dp[n][C];
    }

    public int P2(int C) {
        int[] dp = new int[C+1];

        for(int i = 0; i <= C; i++) {
            for(int j =0; j < weights.length; j++) {
                if(weights[j] <= i) {
                    dp[i] = Math.max(dp[i], dp[i- weights[j]] + profit[j]);
                }
            }
        }
        this.DPArray = dp;
        return dp[C];
    }
}
