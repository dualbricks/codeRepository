package Sorts;

public class HeapSort {
    private void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    private void heapify(int[] arr, int i, int N) {
        int root = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;
        // if left child is greater than root;
        if(l<N && arr[root] < arr[l]) {
            root = l;
        }
        // if right child is greater than root
        if(r<N && arr[root] < arr[r]) {
            root = r;
        }
        if(root != i) {
            swap(arr, root, i);
            heapify(arr, root, N);
        }
    }
    public void sort(int[]arr) {
        int N = arr.length;
        // constructing heap struct (starting from the end does nothing as leaves cant move down)
        for(int i=N/2-1; i>=0; i--) heapify(arr, i, N);

        for(int i=N-1; i>=0; i--) {
            swap(arr,0, i);
            heapify(arr, 0, i);
        }

    }
}
