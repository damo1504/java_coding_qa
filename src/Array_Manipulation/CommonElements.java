package Array_Manipulation;

//Find Common Elements: Implement a method to find common elements between two arrays.
import java.util.HashSet;
import java.util.Set;

public class CommonElements {
  public static void main(String[] args) {
    int[] array1 = {1, 2, 3, 4, 5};
    int[] array2 = {3, 4, 5, 6, 7};

    int[] commonElements = findCommonElements(array1, array2);

    System.out.print("Common Elements: ");
    for (int num : commonElements) {
      System.out.print(num + " ");
    }
  }

  public static int[] findCommonElements(int[] arr1, int[] arr2) {
    Set<Integer> set1 = new HashSet<>();
    for (int num : arr1) {
      set1.add(num);
    }

    Set<Integer> commonSet = new HashSet<>();
    for (int num : arr2) {
      if (set1.contains(num)) {
        commonSet.add(num);
      }
    }

    int[] commonElements = new int[commonSet.size()];
    int index = 0;
    for (int num : commonSet) {
      commonElements[index++] = num;
    }

    return commonElements;
  }
}

//In this example, the findCommonElements function takes two arrays as input and uses sets to efficiently find and store the common elements between the arrays.
//First, we iterate through the first array (arr1) and add its elements to set1.
//Then, we iterate through the second array (arr2) and check if each element is present in set1. If it is, we add it to the commonSet.
//Finally, we create an array to store the common elements and populate it using the elements from the commonSet.
//Please note that this approach assumes that each array contains distinct elements.
//If duplicate elements are possible, you might need to adjust the approach accordingly.
