// Fibonacci series (non-recursive)
public class FibonacciSeries {
    public static void main(String[] args) {
        int n = 10; // Number of terms in the Fibonacci series
        printFibonacciSeries(n);
    }

    private static void printFibonacciSeries(int n) {
        if (n <= 0) {
            System.out.println("Number of terms must be greater than 0.");
            return;
        }

        int a = 0, b = 1; // First two Fibonacci numbers

        System.out.print("Fibonacci series: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int next = a + b; // Calculate the next term
            a = b; // Update a to the next term
            b = next; // Update b to the next term
        }
    }
}
// use case:
//Computer Science: Fibonacci sequences are used in dynamic programming,
// recursion problems, and data structure optimizations
//Financial Analysis: Fibonacci retracement levels are
// used in stock market analysis