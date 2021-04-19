public class Heap_Sort {

    public static void main(String[] args){
        // write your code here
        System.out.println("Heap Sort: It’s a sorting technique based on divide and conquer technique. \n" +
                "It first divides the array into equal halves and then combines them in a sorted manner.\n");
        System.out.println("Best Case: O(n log(n))");
        System.out.println("Average Case: O(n log(n))");
        System.out.println("Worst Case: O(n log(n))");

        int[] array = new int[]{5, 6, 7, 2, 4, 1, 7};

        System.out.println("Given Array");
        printArray(array);

        Heap_Sort ob = new Heap_Sort();
        ob.HeapSort(array);

        System.out.println("\nSorted array");
        printArray(array);
    }

    public void HeapSort(int arr[])
    {
        int n = arr.length;
        // Build heap (rearrange array)
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);
        // One by one extract an element from heap
        for (int i = n - 1; i > 0; i--) {
            // Move current root to end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // call max heapify on the reduced heap
            heapify(arr, i, 0);
        }
    }

    // To heapify a subtree rooted with node i which is
    // an index in arr[]. n is size of heap
    void heapify(int arr[], int n, int i)
    {
        int largest = i; // Initialize largest as root
        int l = 2 * i + 1; // left = 2*i + 1
        int r = 2 * i + 2; // right = 2*i + 2

        // If left child is larger than root
        if (l < n && arr[l] > arr[largest])
            largest = l;

        // If right child is larger than largest so far
        if (r < n && arr[r] > arr[largest])
            largest = r;

        // If largest is not root
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            // Recursively heapify the affected sub-tree
            heapify(arr, n, largest);
        }
    }

    /* A utility function to print array of size n */
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

}
