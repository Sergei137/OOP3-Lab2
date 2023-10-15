import java.util.Arrays;

public class SelectionSortClass {
    public static void main(int[] array){
        System.out.println("\nSelection sort");

        // find length of array and set it to n
        int n = array.length; // 11

        // print unsorted array
        System.out.print("Unsorted array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        
        // selection sort - O(n^2)
        selectionSort(array, n);

        // print sorted array
        System.out.print("Sorted array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    // selection sort
    public static void selectionSort(int[] array, int n){
        
    }
}
