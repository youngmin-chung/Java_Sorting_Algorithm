import java.util.Arrays;

public class Selection_Sort {
    public static void main(String[] args){
        // write your code here
        System.out.println("Selection Sort: Selection Sort also divides the array into a sorted and unsorted subarray. " +
                "\nThough, this time, the sorted subarray is formed by inserting the minimum element of the unsorted subarray at the end of the sorted array.");
        System.out.println("Best Case: O(n-square)");
        System.out.println("Average Case: O(n-square)");
        System.out.println("Worst Case: O(n-square)");

        int[] array = new int[]{5, 6, 7, 2, 4, 1, 7};
        selectionSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int minId = i;
            for (int j = i+1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    minId = j;
                }
            }
            // swapping
            int temp = array[i];
            array[i] = min;
            array[minId] = temp;
        }
    }
}