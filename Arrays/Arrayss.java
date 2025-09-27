package Arrays;
import java.util.*; // import java.util.Arrays

public class Arrayss { // class name can be Arrayss
    public static void main(String[] args) {
        // 1. Declaration of Arrays
        int[] numbers;  
        String[] names;

        // Initialization
        numbers = new int[5];
        names = new String[] {"Alice", "Bob", "Charlie"};
        int[] scores = {90, 80, 70, 60};   

        System.out.println("First name: " + names[0]);

        // Using enhanced for loop
        System.out.println("\nScores using enhanced for loop:");
        for(int score : scores){
            System.out.println(score);
        }

        // Sorting an Array using java.util.Arrays
        int[] arr = {5, 2, 8, 1, 9};
        java.util.Arrays.sort(arr); // Fully qualified name
        System.out.println("\nSorted array: " + java.util.Arrays.toString(arr));

        // Copying an Array
        int[] copyArr = java.util.Arrays.copyOf(arr, arr.length);
        System.out.println("Copied array: " + java.util.Arrays.toString(copyArr));
    }
}
