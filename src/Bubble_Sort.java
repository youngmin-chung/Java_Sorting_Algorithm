import java.util.Arrays;

public class Bubble_Sort {
    public static void main(String[] args){
        // write your code here
        System.out.println("Bubble Sort: It’s a simple sorting algorithm. \nThis sorting algorithm is comparison-based algorithm in which each pair of adjacent elements is compared and \nthe elements are swapped if they are not in order.");
        System.out.println("Best Case: O(n-square)");
        System.out.println("Average Case: O(n-square)");
        System.out.println("Worst Case: O(n-square)");

        int[] array = new int[]{5, 6, 7, 2, 4, 1, 7};
        BubbleSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void BubbleSort(int[] array) {
        boolean sorted = false;
        int temp;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i+1]) {
                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    sorted = false;
                }
            }
        }
    }
}