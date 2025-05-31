import java.util.Arrays;
import java.util.Comparator;
import java.util.OptionalInt;

public class SecondHighest {
    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1}; // Example input
        OptionalInt secondHighest = findSecondHighest(arr); // 34

        if (secondHighest.isPresent()) {
            System.out.println("The second highest number is: " + secondHighest.getAsInt());
        } else {
            System.out.println("No second highest number found.");
        }
    }

    private static OptionalInt findSecondHighest(int[] arr) {
        return Arrays.stream(arr)
                .distinct()
                .boxed()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .mapToInt(Integer::intValue)
                .findFirst();
    }
}
