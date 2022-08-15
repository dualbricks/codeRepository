package Sorts;

import java.util.Random;

public class QuickSort {
    // method overload for quick access
    public static void quickSort(int[] arr) {
        quickSort(arr,0, arr.length-1);
    }
    //main algo for quickSort
    public static void quickSort(int[] arr, int lowIndex, int highIndex) {
        if(lowIndex >= highIndex) return;
        int pivotIndex = new Random().nextInt(highIndex - lowIndex) + lowIndex;
        int pivot = arr[pivotIndex];
        swap(arr, pivotIndex, highIndex);
        int leftPointer  = partition(arr, lowIndex, highIndex, pivot);
        quickSort(arr, lowIndex, leftPointer-1);
        quickSort(arr, leftPointer+1, highIndex);
    }
    // partition function for quickSort
    private static int partition(int[] arr, int lowIndex, int highIndex, int pivot) {
        int leftPointer = lowIndex;
        int rightPointer = highIndex -1;

        while(leftPointer < rightPointer) {
            while(arr[leftPointer] <= pivot && leftPointer < rightPointer) {
                leftPointer++;
            }
            while(arr[rightPointer] >= pivot && rightPointer > leftPointer) {
                rightPointer--;
            }
            swap(arr, leftPointer, rightPointer);
        }
        //
        if(arr[leftPointer] > arr[highIndex]) {
            swap(arr, leftPointer, highIndex);
        }
        else {
            leftPointer = highIndex;
        }
        return leftPointer;
    }
    private static void swap(int[] arr, int leftPointer, int rightPointer) {
        int temp = arr[leftPointer];
        arr[leftPointer] = arr[rightPointer];
        arr[rightPointer] = temp;
    }
}
