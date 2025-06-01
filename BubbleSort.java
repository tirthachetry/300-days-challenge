//manually sorting an array using the Bubble Sort algorithm
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1}; // Example input
        bubbleSort(arr);

        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    private static void bubbleSort(int[] arr) { //TC= O(n^2)
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}