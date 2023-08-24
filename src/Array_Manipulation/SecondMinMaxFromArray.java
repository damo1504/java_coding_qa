package Array_Manipulation;

//Second Min/Max Number from Array:
// Sort the array and access the second element for the second smallest/largest number.
import java.util.Arrays;

public class SecondMinMaxFromArray {
  public static void main(String[] args) {
    int[] numbers = {5, 2, 9, 1, 7, 3};

    Arrays.sort(numbers);  // Sort the array

    int secondSmallest = numbers[1];  // Second element is the second smallest
    int secondLargest = numbers[numbers.length - 2];  // Second-to-last element is the second largest

    System.out.println("Second Smallest number: " + secondSmallest);
    System.out.println("Second Largest number: " + secondLargest);
  }
}

//In this example, the numbers array contains a list of integers.
// We sort the array using the Arrays.sort() method.
// After sorting, the second smallest number will be at index 1, and the second largest number will be at the second-to-last index (index numbers.length - 2).
//After sorting the array, you can directly access these elements to get the second smallest and second largest numbers.
