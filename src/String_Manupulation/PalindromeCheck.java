package String_Manupulation;

//String Palindrome: Compare characters from the start and end, moving towards each other.
//If all characters match, it's a palindrome.
public class PalindromeCheck {
  public static void main(String[] args) {
    String palindrome = "madam";
    String nonPalindrome = "hello";

    System.out.println(palindrome + " is a palindrome: " + isPalindrome(palindrome));
    System.out.println(nonPalindrome + " is a palindrome: " + isPalindrome(nonPalindrome));
  }

  public static boolean isPalindrome(String str) {
    int left = 0;
    int right = str.length() - 1;

    while (left < right) {
      if (str.charAt(left) != str.charAt(right)) {
        return false;
      }
      left++;
      right--;
    }
    return true;
  }
}

//In this example, the isPalindrome function takes a string as input and initializes two pointers: left at the start of the string and right at the end of the string. The function then enters a loop where it compares characters at the left and right pointers.
//If they don't match, it's not a palindrome and the function returns false. If all characters match, the pointers move towards each other until they meet in the middle, and the function returns true indicating that the string is a palindrome.
