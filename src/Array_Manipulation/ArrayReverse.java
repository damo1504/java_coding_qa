package Array_Manipulation;

//Array Reverse: Use two pointers, one at the beginning and one at the end, and swap elements while moving towards each other.
public class ArrayReverse {
  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5};
    reverseArray(arr);
    System.out.print("Reversed array: ");
    for (int num : arr) {
      System.out.print(num + " ");
    }
  }

  public static void reverseArray(int[] arr) {
    int left = 0;
    int right = arr.length - 1;

    while (left < right) {
      int temp = arr[left];
      arr[left] = arr[right];
      arr[right] = temp;
      left++;
      right--;
    }
  }
}

//In this example, the reverseArray function takes an array of integers as input and initializes two pointers: left at the beginning of the array and right at the end of the array.
//The function then enters a loop where it swaps the elements at the left and right pointers and then moves the pointers towards each other.
//This swapping process continues until the pointers meet or cross each other, effectively reversing the array in place.
