//Varargs (Variable Arguments):
//Varargs allow a method to accept a variable number of arguments of the same type.
//It simplifies method calls when the number of arguments is not fixed.
//Syntax: Use ... after the data type in the method parameter.
//Method Chaining:
//Method chaining is a design pattern where multiple methods are called on the same object in a single statement.
//It is achieved by returning the current object (this) from each method.
//It improves code readability and is commonly used in fluent APIs.
public class VarargsAndMethodChaining {

    // Varargs example: Accepts a variable number of integers
    public static void printNumbers(int... numbers) {
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }

    // Method chaining example
    private String message;

    public VarargsAndMethodChaining setMessage(String message) {
        this.message = message;
        return this; // Return the current object
    }

    public VarargsAndMethodChaining appendMessage(String extra) {
        this.message += extra;
        return this; // Return the current object
    }

    public void printMessage() {
        System.out.println(message);
    }

    public static void main(String[] args) {
        // Varargs usage
        System.out.println("Varargs Example:");
        printNumbers(1, 2, 3, 4, 5); // Pass multiple arguments
        printNumbers(); // Pass no arguments

        // Method chaining usage
        System.out.println("\nMethod Chaining Example:");
        VarargsAndMethodChaining example = new VarargsAndMethodChaining();
        example.setMessage("Hello")
                .appendMessage(", World!")
                .printMessage(); // Output: Hello, World!
    }
}
