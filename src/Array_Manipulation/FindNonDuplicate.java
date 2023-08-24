package Array_Manipulation;

//Find Duplicate in Array:
// Given an array where each value appears twice except for one value, find that single non-duplicate value.
public class FindNonDuplicate {
  public static void main(String[] args) {
    int[] array = {4, 2, 3, 2, 4};
    int nonDuplicate = findNonDuplicate(array);
    System.out.println("The non-duplicate value is: " + nonDuplicate);
  }

  public static int findNonDuplicate(int[] arr) {
    int result = 0;
    for (int num : arr) {
      result ^= num;
    }
    return result;
  }
}

//In this example, the findNonDuplicate function takes an array as input and uses XOR to find the non-duplicate value.
// The XOR operation cancels out duplicate values, leaving only the non-duplicate value as the result.
//By performing XOR on all elements in the array, you'll obtain the non-duplicate value as the final result.
// This approach has a time complexity of O(n), where n is the length of the array.
