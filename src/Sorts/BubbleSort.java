package Sorts;

public class BubbleSort {
    public static void bubbleSort(int[] a, int n) {
        int t;
        for(int i=n-1; i>=0; i--) {
            for(int j=0; j<=i-1; j++) {
                if(a[j]>a[j+1]) {
                    t= a[j];
                    a[j] = a[j+1];
                    a[j+1] = t;
                }
            }
        }
    }

}
