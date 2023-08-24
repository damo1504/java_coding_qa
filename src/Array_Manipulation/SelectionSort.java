package Array_Manipulation;

//Sort Array without Built-In Sort Methods:
// Implement selection sort and bubble sort algorithms to sort an array.
public class SelectionSort {
  public static void main(String[] args) {
    int[] array = {64, 34, 25, 12, 22, 11, 90};
    selectionSort(array);
    System.out.println("Sorted array using Selection Sort:");
    for (int num : array) {
      System.out.print(num + " ");
    }
  }

  public static void selectionSort(int[] arr) {
    int n = arr.length;

    for (int i = 0; i < n - 1; i++) {
      int minIndex = i;

      for (int j = i + 1; j < n; j++) {
        if (arr[j] < arr[minIndex]) {
          minIndex = j;
        }
      }

      int temp = arr[minIndex];
      arr[minIndex] = arr[i];
      arr[i] = temp;
    }
  }
}


//Selection sort works by repeatedly selecting the minimum element from the unsorted part of the array and swapping it with the first element of the unsorted part.

