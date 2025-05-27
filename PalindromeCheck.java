//Palindrome check for strings
public class PalindromeCheck {
    public static void main(String[] args) {
        String str = "madam";
        boolean isPalindrome = isPalindrome(str);
        System.out.println("Is the string \"" + str + "\" a palindrome? " + isPalindrome);
    }
    private static boolean isPalindrome(String str) {
        int left = 0, right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false; // Mismatch found
            }
            left++;
            right--;
        }

        return true; // All characters matched
    }
}
//use cases
//Cryptography: Detecting patterns in strings for encryption
// or decryption purposes.
//Natural Language Processing (NLP): Analyzing linguistic patterns
// or creating palindrome-based puzzles.