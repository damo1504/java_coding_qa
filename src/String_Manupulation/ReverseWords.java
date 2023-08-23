package String_Manupulation;

//Reverse Words: Split the string into words, reverse the order of the words, and then join them back into a string.
public class ReverseWords {
  public static void main(String[] args) {
    String original = "Hello, how are you?";
    String reversed = reverseWords(original);
    System.out.println("Original: " + original);
    System.out.println("Reversed: " + reversed);
  }

  public static String reverseWords(String str) {
    String[] words = str.split("\\s+");
    StringBuilder reversed = new StringBuilder();

    for (int i = words.length - 1; i >= 0; i--) {
      reversed.append(words[i]);
      if (i > 0) {
        reversed.append(" ");  // Add a space between words, except for the last word
      }
    }

    return reversed.toString();
  }
}

//In this example, the reverseWords function takes a string as input and first splits it into an array of words using the split method with the regular expression \\s+, which matches one or more whitespace characters.
//Then, the loop iterates through the words in reverse order and appends them to the reversed StringBuilder object.
//A space is added between words except for the last word. Finally, the reversed string is obtained using the toString method of the StringBuilder.

