package ExampleClass3;

public class Main {
    public static void main(String[] args) {
        KnapSack ks = new KnapSack();
        ks.instantiate();
        DPKnapSack dp = ks.getDpKnapSack();
        RecursiveKnapSack rks = ks.getRecursiveKnapSack();
        int C = ks.getC();
        dp.P();


        long startTime1 = System.nanoTime();
        int dpMax = dp.P();
        long timeTaken1 = System.nanoTime() - startTime1;
        System.out.println("DP: ");
        System.out.println("Max Profit: "+ dpMax);
        System.out.println("Time taken: "+timeTaken1/1000+"ms");


        long startTime2 = System.nanoTime();
        int recursiveMax = rks.P(C);
        long timeTaken2 = System.nanoTime() - startTime2;
        System.out.println("Recursive: ");
        System.out.println("Max Profit: "+ recursiveMax);
        System.out.println("Time taken: "+timeTaken2/1000+"ms");


    }
}
