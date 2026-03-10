package Array;

import java.util.Scanner; // Import the Scanner class
import java.util.Arrays;

public class UserInputArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object

        // 1. Get the size of the array from the user
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // 2. Declare and initialize the array
        int[] array = new int[size];

        // 3. Prompt the user to enter the elements
        System.out.println("Enter the elements of the array:");

        // 4. Use a for loop to read input into each array element
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // 5. Print the array elements to confirm
        System.out.println("Array elements: " + Arrays.toString(array));

        // 6. Close the scanner to prevent resource leaks
        scanner.close();
    }
}
