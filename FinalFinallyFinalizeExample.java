//The final keyword is demonstrated with a final variable, method, and class.
//The finally block is used in a try-catch-finally structure.
//The finalize method is overridden to show its usage during garbage collection.
public class FinalFinallyFinalizeExample {

    // Example of final variable
    final int finalVariable = 10;

    // Example of final method
    public final void finalMethod() {
        System.out.println("This is a final method.");
    }

    public void demonstrateFinally() {
        try {
            int result = 10 / 0; // This will throw an exception
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed.");
            //clean up db resources
        }
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalize method called.");
    }

    public static void main(String[] args) {
        // Demonstrate final
        FinalFinallyFinalizeExample example = new FinalFinallyFinalizeExample();
        System.out.println("Final variable value: " + example.finalVariable);
        example.finalMethod();

        // Demonstrate finally
        example.demonstrateFinally();

        // Demonstrate finalize
        example = null;
        System.gc(); // Request garbage collection
    }
}