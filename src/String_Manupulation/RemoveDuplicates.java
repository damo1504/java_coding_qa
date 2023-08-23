package String_Manupulation;

//Remove Duplicates from a String:
//Use a data structure (e.g., set) to keep track of characters seen so far and construct the resulting string.
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
  public static void main(String[] args) {
    String input = "programming";
    String result = removeDuplicates(input);
    System.out.println("Original: " + input);
    System.out.println("After removing duplicates: " + result);
  }

  public static String removeDuplicates(String str) {
    Set<Character> seen = new HashSet<>();
    StringBuilder result = new StringBuilder();

    for (char c : str.toCharArray()) {
      if (!seen.contains(c)) {
        seen.add(c);
        result.append(c);
      }
    }

    return result.toString();
  }
}

//In this example, the removeDuplicates function takes a string as input and initializes a HashSet named seen to keep track of characters that have been encountered.
//The function iterates through the characters of the input string. For each character, it checks whether it's already in the seen set. If the character is not in the set, it's added to both the seen set and the result StringBuilder.
//By doing this, the result StringBuilder accumulates only unique characters from the input string, effectively removing duplicates. Finally, the result is converted to a string using the toString method of the StringBuilder and returned as the output.
