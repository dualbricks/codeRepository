package ExampleClass3;

public class RecursiveKnapSack {
    private int[] weights;
    private int[] profit;
    private int C;
    public RecursiveKnapSack(int C, int[]profit, int[] weights) {
        this.C = C;
        this.profit = profit;
        this.weights = weights;
    }

    public int P(int C) {
        int maxP = 0;
        for(int i =0; i< profit.length; i++) {
            if(weights[i] <= C) {
                maxP = Math.max(maxP, profit[i] + P(C-weights[i]));
            }
        }
        return maxP;
    }

}
