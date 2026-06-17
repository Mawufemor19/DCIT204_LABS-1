import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int size = input.nextInt();

        int[] array = new int[size];

        System.out.println("Enter array elements:");
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }

        System.out.print("Enter target value to search for: ");
        int target = input.nextInt();

        Algorithm search = new Algorithm();

        // Linear Search
        int linearResult = search.linearSearch(array, target);

        if (linearResult != -1) {
            System.out.println("Linear Search: Target found at index " + linearResult);
        } else {
            System.out.println("Linear Search: Target not found");
        }

        // Binary Search requires sorted array
        Arrays.sort(array);

        int binaryResult = search.binarySearch(array, target);

        if (binaryResult != -1) {
            System.out.println("Binary Search: Target found at index " + binaryResult);
        } else {
            System.out.println("Binary Search: Target not found");
        }

        input.close();
    }
}
