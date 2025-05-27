// Anagram detection
public class AnagramCheck {
    public static void main(String[] args) {
        String str1 = "lister";
        String str2 = "silent";

        boolean isAnagram = areAnagrams(str1, str2);
        System.out.println("Are \"" + str1 + "\" and \"" + str2 + "\" anagrams? " + isAnagram);
    }

    private static boolean areAnagrams(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false; // Different lengths cannot be anagrams
        }

        int[] charCount = new int[256]; // Assuming ASCII characters

        // Count characters in str1 and str2
        for (int i = 0; i < str1.length(); i++) {
            charCount[str1.charAt(i)]++;
            charCount[str2.charAt(i)]--;
        }

        // Check if all counts are zero
        for (int count : charCount) {
            if (count != 0) {
                return false;
            }
        }

        return true; // All counts matched
    }
}
