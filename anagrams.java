
// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Arrays;

class anagrams {
    public static boolean isAnagram(String str1, String str2) {
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        if (str1.length() != str2.length()) {
            return false;
        }
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        return Arrays.equals(charArray1, charArray2);
    }

    public static void main(String[] args) {
        String word1 = "listen";
        String word2 = "silent";

        if (isAnagram(word1, word2)) {
            System.out.println("Both words are anagrams");
        } else {
            System.out.println("Both words are not anagrams");
        }
    }
}