package ExampleClass3;

import java.util.Scanner;

public class KnapSack {
    private int[] weight;
    private int[] profit;

    public int getC() {
        return C;
    }

    private int C;



    private DPKnapSack dpKnapSack;
    private RecursiveKnapSack recursiveKnapSack;

    public DPKnapSack getDpKnapSack() {
        return dpKnapSack;
    }

    public RecursiveKnapSack getRecursiveKnapSack() {
        return recursiveKnapSack;
    }
    public KnapSack() {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many Items do you have?");
        int n = sc.nextInt();
        this.weight = new int[n];
        this.profit = new int[n];
        System.out.println("Enter the weights for each item");
        for(int i=0; i<n;i++) {
            weight[i] = sc.nextInt();
        }
        System.out.println("Enter the profits for each item");
        for(int j=0; j<n;j++) {
            profit[j] = sc.nextInt();
        }
        System.out.println("Enter the maximum capacity of your knacksack");
        this.C = sc.nextInt();

    }

    public void instantiate() {
        this.dpKnapSack = new DPKnapSack(C,profit,weight);
        this.recursiveKnapSack = new RecursiveKnapSack(C, profit, weight);
    }
}
