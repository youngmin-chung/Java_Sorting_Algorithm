import java.util.Arrays;

public class Insertion_Sort {
    public static void main(String[] args){
        // write your code here
        System.out.println("Insertion Sort: It’s an in-place comparison-based sorting algorithm. " +
                "\nA sub-list is maintained which is always sorted. ");
        System.out.println("Best Case: O(n-square)");
        System.out.println("Average Case: O(n-square)");
        System.out.println("Worst Case: O(n-square)");

        int[] array = new int[]{5, 6, 7, 2, 4, 1, 7};
        insertionSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int j = i - 1;
            while(j >= 0 && current < array[j]) {
                array[j+1] = array[j];
                j--;
            }
            // at this point we've exited, so j is either -1
            // or it's at the first element where current >= a[j]
            array[j+1] = current;
        }
    }
}