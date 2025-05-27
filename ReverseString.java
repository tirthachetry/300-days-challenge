//Reverse a string without built-in methods
public class ReverseString {
    public static void main(String[] args) {
        String str = "hello"; // olleh
        String reversed = reverseString(str);
        System.out.println("Reversed string: " + reversed);
    }

    private static String reverseString(String str) {
        char[] charArray = str.toCharArray();
        int left = 0, right = charArray.length - 1;

        // Swap characters from both ends
        while (left < right) {
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;
            right--;
        }

        return new String(charArray);
    }
}