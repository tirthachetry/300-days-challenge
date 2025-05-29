// Factorial using recursion
public class Factorial {
    public static void main(String[] args) {
        int number = 5; // Example input
        int result = factorial(number);
        System.out.println("Factorial of " + number + " is: " + result);
    }

    private static int factorial(int n) {
        if(n==0 || n==1){
            return 1;
        }
        return n*factorial(n-1);
    }
}
//use case:
//Factorials are used in algorithms, 
// such as backtracking and dynamic programming.