import java.util.Arrays;

//Remove duplicates from array without collections
public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {4, 1, 2, 3, 4, 5, 5, 6, 7, 8, 8, 9};
        int n = arr.length;

        Arrays.sort(arr);

        // Remove duplicates
        int newLength = removeDuplicates(arr, n);

        // Print the modified array
        for (int i = 0; i < newLength; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static int removeDuplicates(int[] arr, int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        int[] temp = new int[n];
        int j = 0;

        // Traverse the array and store unique elements in temp[]
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                temp[j++] = arr[i];
            }
        }
        temp[j++] = arr[n - 1];

        // Copy the unique elements back to arr[]
        for (int i = 0; i < j; i++) {
            arr[i] = temp[i];
        }

        return j;
    }
}
