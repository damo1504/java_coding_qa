package String_Manupulation;

//String Reverse:
//Use a loop to traverse the characters in reverse order and construct the reversed string in java
public class StringReverse {
  public static void main(String[] args) {
    String original = "Hello, World!";
    String reversed = reverseString(original);
    System.out.println("Original: " + original);
    System.out.println("Reversed: " + reversed);
  }

  public static String reverseString(String str) {
    StringBuilder reversed = new StringBuilder();
    for (int i = str.length() - 1; i >= 0; i--) {
      reversed.append(str.charAt(i));
    }
    return reversed.toString();
  }
}

//In this example, the reverseString function takes a string as input and uses a StringBuilder to construct the reversed string.
//The loop iterates through the characters of the original string in reverse order and appends each character to the reversed StringBuilder object.
//Finally, the reversed string is obtained using the toString method of the StringBuilder.