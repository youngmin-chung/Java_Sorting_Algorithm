public class Quick_Sort {
    public static void main(String[] args){
        // write your code here
        System.out.println("Quick Sort: It’s a highly efficient sorting algorithm and is based on partitioning of array of data into smaller arrays." +
                "\nA large array is partitioned into two arrays one of which holds values smaller than the specified value, say pivot. " +
                "\nIt’s based on which the partition is made and another array holds values greater than the pivot value.");
        System.out.println("\nBest Case: O(n log(n))");
        System.out.println("Average Case: O(n log(n))");
        System.out.println("Worst Case: O(n-square )");

        int[] array = new int[]{5, 6, 7, 2, 4, 1, 7};
        int n = array.length;
        System.out.println("\nGiven Array");
        printArray(array, n);

        Quick_Sort ob = new Quick_Sort();
        ob.QuickSort(array, 0, n-1);

        System.out.println("Sorted array");
        printArray(array, n);
    }

    /* The main function that implements QuickSort
          arr[] --> Array to be sorted,
          low --> Starting index,
          high --> Ending index
    */
    static void QuickSort(int[] arr, int low, int high)
    {
        if (low < high)
        {
            // pi is partitioning index, arr[p]
            // is now at right place
            int pi = partition(arr, low, high);

            // Separately sort elements before
            // partition and after partition
            QuickSort(arr, low, pi - 1);
            QuickSort(arr, pi + 1, high);
        }
    }

    /* This function takes last element as pivot, places  the pivot element at its correct position in sorted
       array, and places all smaller (smaller than pivot) to left of pivot and all greater elements to right of pivot */
    static int partition(int[] arr, int low, int high)
    {
        // pivot
        int pivot = arr[high];
        // Index of smaller element and indicates the right position of pivot found so far
        int i = (low - 1);

        for(int j = low; j <= high - 1; j++)
        {
            // If current element is smaller than the pivot
            if (arr[j] < pivot)
            {
                // Increment index of smaller element
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }

    // Function to print an array
    static void printArray(int[] arr, int size)
    {
        for(int i = 0; i < size; i++)
            System.out.print(arr[i] + " ");

        System.out.println();
    }

    // A utility function to swap two elements
    static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
