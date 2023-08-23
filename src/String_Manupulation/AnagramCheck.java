package String_Manupulation;

//Two-String Anagram: Count occurrences of each character in both strings using a map or an array.
//If the counts match for all characters, the strings are anagrams.
import java.util.HashMap;
import java.util.Map;

public class AnagramCheck {
  public static void main(String[] args) {
    String str1 = "listen";
    String str2 = "silent";
    String str3 = "hello";

    System.out.println(str1 + " and " + str2 + " are anagrams: " + areAnagrams(str1, str2));
    System.out.println(str1 + " and " + str3 + " are anagrams: " + areAnagrams(str1, str3));
  }

  public static boolean areAnagrams(String str1, String str2) {
    if (str1.length() != str2.length()) {
      return false;
    }

    Map<Character, Integer> charCountMap = new HashMap<>();

    for (char c : str1.toCharArray()) {
      charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
    }

    for (char c : str2.toCharArray()) {
      if (!charCountMap.containsKey(c)) {
        return false;
      }
      charCountMap.put(c, charCountMap.get(c) - 1);
      if (charCountMap.get(c) == 0) {
        charCountMap.remove(c);
      }
    }

    return charCountMap.isEmpty();
  }
}

//In this example, the areAnagrams function takes two strings as input and first checks if they have the same length. If not, they cannot be anagrams.
//The function then uses a Map called charCountMap to store the counts of characters in the first string. It iterates through the characters of the first string, updating the counts in the map.
//Next, the function iterates through the characters of the second string. For each character, it checks if the character is in the map. If not, the strings cannot be anagrams. If the character is present, it decrements the count in the map. If the count becomes zero, the character is removed from the map.
//Finally, the function checks if the map is empty. If it's empty, it means all characters have been matched and the strings are anagrams.
//Please note that this approach assumes that the input strings contain only lowercase letters. If the strings can contain uppercase letters or other characters, you might need to consider case-insensitive comparisons or additional character handling.
