import java.util.HashSet;
import java.util.Set;
//count vowels and consonants in a string
public class VowelConsonantCount {
    public static void main(String[] args) {
        String str = "Hello World";
        int[] counts = countVowelsAndConsonants(str);

        System.out.println("Number of vowels: " + counts[0]);
        System.out.println("Number of consonants: " + counts[1]);
    }

    private static int[] countVowelsAndConsonants(String str) {
        Set<Character> vowelsSet = new HashSet<>(); //better performance for lookups
        vowelsSet.add('a');
        vowelsSet.add('e');
        vowelsSet.add('i');
        vowelsSet.add('o');
        vowelsSet.add('u');

        int vowels = 0, consonants = 0;
        str = str.toLowerCase();
        // Iterate through each character in the string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'a' && ch <= 'z') { // Check if the character is a letter
                if (vowelsSet.contains(ch)) {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        return new int[]{vowels, consonants};
    }
}