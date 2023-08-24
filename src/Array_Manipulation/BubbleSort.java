package Array_Manipulation;

//Bubble sort repeatedly steps through the list, compares adjacent elements, and swaps them if they are in the wrong order.
public class BubbleSort {
  public static void main(String[] args) {
    int[] array = {64, 34, 25, 12, 22, 11, 90};
    bubbleSort(array);
    System.out.println("Sorted array using Bubble Sort:");
    for (int num : array) {
      System.out.print(num + " ");
    }
  }

  public static void bubbleSort(int[] arr) {
    int n = arr.length;

    for (int i = 0; i < n - 1; i++) {
      for (int j = 0; j < n - i - 1; j++) {
        if (arr[j] > arr[j + 1]) {
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }
  }
}
