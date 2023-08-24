package Array_Manipulation;

//Max/Min Number from Array:
// Initialize two variables to track the maximum and minimum values.
// Traverse the array, updating these variables accordingly.
public class MaxMinFromArray {
  public static void main(String[] args) {
    int[] numbers = {5, 2, 9, 1, 7, 3};

    int max = Integer.MIN_VALUE;  // Initialize max to the smallest possible value
    int min = Integer.MAX_VALUE;  // Initialize min to the largest possible value

    for (int num : numbers) {
      if (num > max) {
        max = num;
      }
      if (num < min) {
        min = num;
      }
    }

    System.out.println("Maximum number: " + max);
    System.out.println("Minimum number: " + min);
  }
}

//In this example, the numbers array contains a list of integers.
// We initialize max to the smallest possible value using Integer.MIN_VALUE, and min to the largest possible value using Integer.MAX_VALUE.
//The loop then iterates through each element in the array. For each element, it checks if the element is greater than the current max.
// If it is, the max is updated with the new value. Similarly, it checks if the element is smaller than the current min, and if it is, the min is updated with the new value.
//After the loop, you'll have the maximum and minimum values from the array stored in the max and min variables, respectively.

