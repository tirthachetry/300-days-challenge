// Find the missing number in an array
public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6}; // Example input should be positive numbers
        int n = 6; // Total numbers from 1 to n
        int missingNumber = findMissingNumber(arr, n);
        System.out.println("The missing number is: " + missingNumber);
    }

    private static int findMissingNumber(int[] arr, int n) {
        int xor1 = 0; // XOR of all numbers from 1 to n
        int xor2 = 0; // XOR of all elements in the array

        for (int i = 1; i <= n; i++) {
            xor1 ^= i; // XOR all numbers from 1 to n
        }

        for (int num : arr) {
            xor2 ^= num; // XOR all elements in the array
        }

        return xor1 ^ xor2; // XOR of the two results gives the missing number
    }
}
