import java.util.Arrays;
//Words Count in a sentence
public class WordCount {
    public static void main(String[] args) {
        String sentence = "This is yet another example sentence."; // Example input
        int wordCount = countWords(sentence);

        System.out.println("The number of words in the sentence is: " + wordCount);
    }

    private static int countWords(String sentence) { //TC: O(n), where n is the number of characters in the sentence
        if (sentence == null || sentence.isEmpty()) {
            return 0; // Return 0 for empty or null sentences
        }
        return (int) Arrays.stream(sentence.split("\\s+"))
                .filter(word->!word.isEmpty())
                .count();
    }
}