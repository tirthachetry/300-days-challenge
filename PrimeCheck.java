//program to check if a number is prime
public class PrimeCheck {
    public static void main(String[] args) {
        int number = 4; // Example input
        boolean isPrime = isPrime(number);

        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }

    private static boolean isPrime(int number) { //TC= O(sqrt(n))
        if (number <= 1) {
            return false; // Numbers less than or equal to 1 are not prime
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; // Number is divisible by i, so it's not prime
            }
        }
        return true; // Number is prime
    }
}

//Paper link: https://www.researchgate.net/publication/339642995_Prime_numbers_and_their_analysis