//First non-repeating character in a string
public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        String str = "swiss"; // w
        char result = findFirstNonRepeatingCharacter(str);

        if (result != '\0') {
            System.out.println("First non-repeating character: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }
    }

    private static char findFirstNonRepeatingCharacter(String str) {
        int[] charCount = new int[256]; // Assuming ASCII characters

        // Count the frequency of each character
        for (int i = 0; i < str.length(); i++) {
            charCount[str.charAt(i)]++;
        }

        // Find the first character with a frequency of 1
        for (int i = 0; i < str.length(); i++) {
            if (charCount[str.charAt(i)] == 1) {
                return str.charAt(i);
            }
        }

        return '\0'; // Return null character if no non-repeating character is found
    }
}