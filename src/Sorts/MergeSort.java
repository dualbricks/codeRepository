package Sorts;

public class MergeSort {
    // Helper functions for mergeSort
    private static void  merge(int[] arr, int n, int m) {
        int mid = (n+m)/2;
        int a=n, b=mid+1;
        int temp, cmp,i;
        if(m-n<=0) return;
        while(a <= mid && b <= m) {
            cmp = compare(arr[a], arr[b]);
            if(cmp > 0) {
                temp = arr[b++];
                for(i=++mid; i>a;i--) {
                    arr[i] =arr[i-1];
                }
                arr[a++] = temp;
            }
            else if(cmp < 0) {
                a++;
            }
            else{
                if(a==mid && b==m) break;
                temp = arr[b++];
                a++;
                for(i=++mid; i>a;i--) {
                    arr[i] = arr[i-1];
                }
                arr[a++] = temp;
            }
        }


    }
    private static int compare(int a, int b) {
        return Integer.compare(a, b);
    }
    public static void mergeSort(int[] arr) {
        mergeSort(arr, 0, arr.length-1);
    }

    public static void mergeSort(int[] arr, int n, int m) {
        int mid = (n+m)/2;
        if(m-n<=0) return;
        else if(m-n>1) {
            mergeSort(arr, n, mid);
            mergeSort(arr, mid+1, m);
        }
        merge(arr, n, m);
    }

    public MergeSort(int[] arr, int n, int m) {
    }
}
