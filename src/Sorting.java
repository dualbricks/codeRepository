import java.util.Scanner;
import Sorts.*;
public class Sorting {
    //Simple implementation of bubbleSort
    public static void bubbleSort(int [] a, int n) {
        BubbleSort.bubbleSort(a, n);
    }
    // Simple implementation of insertionSort
    public static void insertionSort(int []a, int n) {
        InsertionSort.insertionSort(a, n);
    }

    //Implementation of Merge Sort
     public static void mergeSort(int[] arr, int n, int m) {
        MergeSort.mergeSort(arr, n, m);
    }
    public static void quickSort(int[]arr, int n, int m) {
        QuickSort.quickSort(arr,n,m);
    }

    // For printing array
    private static void  printArray(int[] arr) {
        for(int i =0; i<= arr.length-1; i++) {
            System.out.println(arr[i]);
        }
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
        //bubbleSort(arr, n);
        //insertionSort(arr, n);
        //mergeSort(arr,0,arr.length-1);
        quickSort(arr, 0, arr.length-1);
        printArray(arr);

    }
}
