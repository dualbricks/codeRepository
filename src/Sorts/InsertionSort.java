package Sorts;

public class InsertionSort {
    public static void insertionSort(int[] a, int n) {
        int t,j;
        for(int i=0; i<n-1; i++) {
            j=i;
            while(j>0 && a[j-1] > a[j]) {
                t=a[j];
                a[j] = a[j-1];
                a[j-1] = t;
                j--;
            }
        }
    }
}
