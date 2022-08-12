import java.util.Scanner;
public class Sorting {
    //Simple implementation of bubbleSort
    public static void bubbleSort(int [] a, int n) {
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
    public static void merge(int[] arr, int n, int m) {
        if(m-n<=0) return;


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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr;
        System.out.println("Please enter the number of elements: ");
        int n = sc.nextInt();
        arr = new int [n];
        for(int i=0; i<n; i++) {
            System.out.println("Enter the integer: ");
            arr[i] = sc.nextInt();
        }
        sc.close();
        bubbleSort(arr, n);
        for(int i=0;i<n; i++) {
            System.out.println(arr[i]);
        }

    }
}
